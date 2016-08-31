package com.challenge.mthtolast;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MthToLast {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String input[] = line.split(" ");
			int index = input.length - 1 - Integer.parseInt(input[input.length - 1]);
			if (index >= 0)
				System.out.println(input[index]);
		}

	}

}
