package com.lsamayoa.skill;

import java.util.Arrays;

import org.junit.Test;

public class NumberArrayUtilsTest {

	@Test
	public void testArrayRotation(){
		// Set of inputs to test
		int[][] inputs = new int[][]{{1,2,3,4,5},{5,1,2,3,4}};
		// Sets of shifts that are going to be aplied
		int[] shifts = new int[]{1,3};
		// Set of expected results
		int[][] outputs = new int[][]{{5,1,2,3,4},{2,3,4,5,1}};
		
		for (int i = 0; i < outputs.length; i++) {
			int[] result = NumberArrayUtils.rotate(inputs[i], shifts[i]);
			org.junit.Assert.assertTrue(Arrays.equals(result, outputs[i]));
		}
	}	
}