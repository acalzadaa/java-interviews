package com.lessons.plus;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOddRepeatedNumbers {

	Function<Integer[], Map<Integer, Long>> groupBy = n -> Arrays.stream(n)
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	Function<Map<Integer, Long>, Map<Integer, Long>> findOdd = n -> n.entrySet().stream()
			.filter(key -> 0 != key.getValue() % 2)
			.collect(Collectors.toMap(key -> key.getKey(), key -> key.getValue()));

	Function<Map<Integer, Long>, Integer[]> returnArray = n -> (Integer[]) n.entrySet().stream()
			.map(key -> key.getKey()).toArray(Integer[]::new);

	public Integer[] findNumbers(Integer[] numbers) {
		return returnArray.apply(findOdd.apply(groupBy.apply(numbers)));
	}

}
