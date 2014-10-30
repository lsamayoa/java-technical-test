package com.lsamayoa.skill;

public class NumberArrayUtil {

	public static int[] rotate(int[] input, int shift) {
		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			int pos = i + shift;
			if (pos >= input.length)
				pos = pos - input.length;
			output[pos] = input[i];
		}
		return output;
	}

}
