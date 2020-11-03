package com.lessons.plus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class FromListToMapTest {

	@Test
	void test() {
		String[] chars = { "A", "B", "C", "A", "C", "A" };

		List<String> lists = new ArrayList<>(Arrays.asList(chars));

		System.out.println(lists);
		Map<String, Long> maps = new HashMap<>();

		maps = lists.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(maps);

		maps = maps.entrySet().stream().filter(key -> 0 != key.getValue() % 2)
				.collect(Collectors.toMap(key -> key.getKey(), key -> key.getValue()));

		System.out.println(maps);

		String[] oddrepeated = maps.entrySet().stream().map(key -> key.getKey()).toArray(String[]::new);

		for (String odd : oddrepeated) {
			System.out.println(odd);
		}

	}
}
