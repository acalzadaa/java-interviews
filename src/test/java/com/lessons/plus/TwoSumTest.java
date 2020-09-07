package com.lessons.plus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TwoSumTest {

	@Test
	void testTwoSums() {
		TwoSum two = new TwoSum();
		int[] result = two.findTwoSum(new int[] { 1, 2, 3 }, 4);
		assertEquals(2, result.length);
		assertEquals(new int[] { 0, 2 }[0], two.findTwoSum(new int[] { 1, 2, 3 }, 4)[0]);
		assertEquals(new int[] { 0, 2 }[1], two.findTwoSum(new int[] { 1, 2, 3 }, 4)[1]);

	}

}
