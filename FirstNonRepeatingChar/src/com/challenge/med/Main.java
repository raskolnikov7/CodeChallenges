package com.challenge.med;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			for (int i = 0; i < line.length(); i++) {
				StringBuilder sb = new StringBuilder(line);
				sb.deleteCharAt(i);

				String resultString = sb.toString();
				if (!resultString.contains(String.valueOf(line.charAt(i)))) {
					System.out.println(line.charAt(i));
					break;
				}

			}
		}

	}

}
