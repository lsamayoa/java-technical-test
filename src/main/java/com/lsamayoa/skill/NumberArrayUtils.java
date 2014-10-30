package com.lsamayoa.skill;

/**
 * @author Leonel Samayoa
 *
 * This class contains utilities to transform number arrays.
 * (it contains the technical test answer.)
 *
 */
public class NumberArrayUtils {

	
	/**
	 * It rotates an array of integer by a finite number of steps.
	 * Example: if N=2, given the input array [1, 2, 3, 4, 5, 6] the function should return [5, 6, 1, 2, 3, 4]
	 * 
	 * @param input the array of numbers that it's to be rotated
	 * @param shift the number of positions the rotation should shift
	 * @return a new array containing the array of numbers in the rotated order
	 */
	public static int[] rotate(int[] input, int shift) {
		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			// We calculate the position 
			// Adding the shift then moduling to remove the excess amount.
			int pos = (i + shift) % input.length;
			output[pos] = input[i];
		}
		return output;
	}

}
