package com.lessons.plus;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FromListToMap {

	public Map<String, Long> convert(List<String> input) {
		return input.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}

}
