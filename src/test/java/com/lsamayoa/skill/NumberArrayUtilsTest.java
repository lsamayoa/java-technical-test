package com.lsamayoa.skill;

import java.util.Arrays;

import org.junit.Test;

public class NumberArrayUtilsTest {

	@Test
	public void testArrayRotation(){
		int[] result = NumberArrayUtils.rotate(new int[]{1,2,3,4,5}, 2);
		org.junit.Assert.assertTrue(Arrays.equals(result, new int[]{4,5,1,2,3}));
	}	
}