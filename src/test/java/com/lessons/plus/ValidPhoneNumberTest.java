package com.lessons.plus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ValidPhoneNumberTest {

	@Test
	void test() {
		assertEquals(true, ValidPhoneNumber.validPhoneNumber("(123) 123-1233"));
		assertEquals(false, ValidPhoneNumber.validPhoneNumber("(023) 123-1233"));
		assertEquals(false, ValidPhoneNumber.validPhoneNumber("(123)123-1233"));

	}

}
