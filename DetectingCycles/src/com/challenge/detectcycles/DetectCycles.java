package com.challenge.detectcycles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
2 0 6 3 1 6 3 1 6 3 1
3 4 8 0 11 9 7 2 5 6 10 1 49 49 49 49
1 2 3 1 2 3 1 2 3
 */
public class DetectCycles {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int numLines = Integer.valueOf(buffer.readLine());
		int linePos = 0;
		int n = 0;
		int len = 0;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();

		}

	}
}
