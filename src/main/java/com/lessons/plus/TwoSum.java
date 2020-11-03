package com.lessons.plus;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoSum {
	public int[] findTwoSum(int[] numbers, int target) {

		List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
		list = list.stream().filter(n -> n < target).collect(Collectors.toList());
		return numbers;

	}
}
