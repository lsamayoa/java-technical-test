package com.lsamayoa.skill;

import java.util.Arrays;

import org.junit.Test;

public class NumberArrayUtilTest {

	@Test
	public void testArrayRotation(){
		int[] result = NumberArrayUtil.rotate(new int[]{1,2,3,4,5}, 2);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		org.junit.Assert.assertTrue(Arrays.equals(result, new int[]{4,5,1,2,3}));
	}	
}