package com.lessons.plus;

import java.util.stream.IntStream;

public class MultiplesOf3And5 {

	public int solution(int number) {
		return IntStream.range(1, number).filter(n -> (n > 0) && (n % 3 == 0 || n % 5 == 0)).sum();
	}

}
