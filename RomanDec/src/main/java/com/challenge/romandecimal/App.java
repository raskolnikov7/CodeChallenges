package com.challenge.romandecimal;

import java.util.HashMap;
import java.util.Map;

public class App {
	private Map<Character, Integer> valueMap = new HashMap<Character, Integer>();

	public static void main(String[] args) {
		String input = "MDCLXVI";
		System.out.println(new App().getResult(input));

	}

	public Integer getResult(String input) {
		int result = 0;
		int currValue = 0;
		int lastValue = 0;
		for (int i = input.length() - 1; i >= 0; i--) {
			lastValue = currValue;
			currValue = valueMap.get(Character.toUpperCase(input.charAt(i)));
			if (currValue < lastValue) {
				result = result - currValue;
			} else
				result = result + currValue;
		}

		return Integer.valueOf(result);
	}

	public App() {
		valueMap.put('I', new Integer(1));
		valueMap.put('V', new Integer(5));
		valueMap.put('X', new Integer(10));
		valueMap.put('L', new Integer(50));
		valueMap.put('C', new Integer(100));
		valueMap.put('D', new Integer(500));
		valueMap.put('M', new Integer(1000));

	}

}
