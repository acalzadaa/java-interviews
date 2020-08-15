package com.lessons.plus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.lessons.plus.Vowels;

class VowelsTest {

	@Test
	void test() {

		Vowels vowels = new Vowels();
		assertEquals(5, vowels.getCount("aaaaa"));
		assertEquals(5, vowels.getCount("eeeee"));
		assertEquals(5, vowels.getCount("iiiii"));
		assertEquals(5, vowels.getCount("ooooo"));
		assertEquals(5, vowels.getCount("uuuuu"));
		assertEquals(0, vowels.getCount("bdnsh"));
		assertEquals(3, vowels.getCount("ababa"));

	}

}
