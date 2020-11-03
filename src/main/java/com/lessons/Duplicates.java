package com.lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 2, 3, 3, 3 };

		System.out.println(Arrays.deepToString(dups(intArray)));
	}

	private static Integer[] dups(Integer[] intArray) {

		List<Integer> numbers = new ArrayList<>(Arrays.asList(intArray));

		return numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(keys -> keys.getValue() > 1).map(keys -> keys.getKey()).toArray(Integer[]::new);

	}

}
