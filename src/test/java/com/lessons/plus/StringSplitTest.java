package com.lessons.plus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lessons.plus.StringSplit;

// TODO: Replace examples and use TDD development by writing your own tests

public class StringSplitTest {

	StringSplit stringSplit = new StringSplit();

	@Test
	public void testEvenString() {
		String s = "abcdef";
		String s1 = "HelloWorld";
		assertEquals("Should handle even string", "[ab, cd, ef]", Arrays.toString(stringSplit.solution(s)));
		assertEquals("Should handle even string", "[He, ll, oW, or, ld]", Arrays.toString(stringSplit.solution(s1)));
	}

	@Test
	public void testOddString() {
		String s = "abcde";
		String s1 = "LovePizza";
		assertEquals("Should handle odd string", "[ab, cd, e_]", Arrays.toString(stringSplit.solution(s)));
		assertEquals("Should handle odd string", "[Lo, ve, Pi, zz, a_]", Arrays.toString(stringSplit.solution(s1)));
	}
}