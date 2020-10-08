package com.lessons.plus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindOddRepeatedNumbersTest {

	FindOddRepeatedNumbers fo = new FindOddRepeatedNumbers();

	@Test
	void test() {
		Integer[] numbers = { 1, 1, 2, 2, 3, 5, 66, 34, 22, 7, 7, 7 };
		Integer[] returnIntArray;

		returnIntArray = new Integer[] { 66, 34, 3, 5, 22, 7 };

		Assertions.assertEquals(returnIntArray[0], fo.findNumbers(numbers)[0]);
		Assertions.assertEquals(returnIntArray.length, fo.findNumbers(numbers).length);

	}

}
