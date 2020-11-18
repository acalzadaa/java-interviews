package com.lessons.plus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JadenCaseTest {

	@Test
	void test() {
		System.out.println(JadenCase.toJadenCase("uno dos tres cuatro"));
		Assertions.assertEquals("Uno Dos Tres Cuatro", JadenCase.toJadenCase("uno dos tres cuatro"));
		Assertions.assertEquals(null, JadenCase.toJadenCase(""));
	}

}
