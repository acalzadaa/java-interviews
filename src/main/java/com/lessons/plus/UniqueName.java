package com.lessons.plus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueName {
	public String firstUniqueName(String[] names) {
		List<String> uniqueNames = new ArrayList<>(Arrays.asList(names));

		return uniqueNames.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(map -> map.getValue() == 1).findFirst().get().getKey().toString();

	}

}