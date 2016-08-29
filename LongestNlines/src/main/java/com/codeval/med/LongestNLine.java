package com.codeval.med;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LongestNLine {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		List<Line> lineList = new ArrayList<Line>();
		int numLines = Integer.valueOf(buffer.readLine());
		int linePos = 0;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			lineList.add(new Line(linePos++, line.length(), line));
		}
		Collections.sort(lineList, new LineComparator());
		for (int i = lineList.size() - 1; i >= lineList.size() - numLines; i--) {

			System.out.println(lineList.get(i).getText() + ", POS:" + lineList.get(i).getPos() + ", LENGTH: "
					+ lineList.get(i).getLen());

			// System.out.println(lineList.get(i).getText());

		}

	}
}

class Line {
	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Line(int pos, int len, String text) {
		super();
		this.pos = pos;
		this.len = len;
		this.text = text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + len;
		result = prime * result + pos;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Line other = (Line) obj;
		if (len != other.len)
			return false;
		if (pos != other.pos)
			return false;
		return true;
	}

	private int pos = 0;
	private int len = 0;
	private String text = null;
}

class LineComparator implements Comparator<Line> {

	public int compare(Line l1, Line l2) {
		if (l1.getLen() < l2.getLen()) // first sort on lentghs
			return -1;
		else if (l1.getLen() > l2.getLen())
			return 1;
		else // then on position
			return Integer.valueOf(l1.getPos()).compareTo(l2.getPos());

	}

}
