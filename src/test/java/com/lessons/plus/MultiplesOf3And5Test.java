package com.lessons.plus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MultiplesOf3And5Test {

	@Test
	void test() {
		assertEquals(0, new MultiplesOf3And5().solution(-11));
		assertEquals(0, new MultiplesOf3And5().solution(-1));
		assertEquals(0, new MultiplesOf3And5().solution(3));
		assertEquals(3, new MultiplesOf3And5().solution(5));
		assertEquals(23, new MultiplesOf3And5().solution(10));
		assertEquals(78, new MultiplesOf3And5().solution(20));
	}

}
