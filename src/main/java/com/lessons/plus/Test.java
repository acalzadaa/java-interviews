package com.lessons.plus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.Data;

@Data
public class Test {
	public static void main(String[] args) {
		/* string array */
		String[] arrays = { "a", "a", "a", "b", "b", "b", "c", "c", "d", "d", "e" };

		List<String> lists = new ArrayList<>(Arrays.asList(arrays));
		System.out.println(lists);

		Collections.reverse(lists);
		System.out.println(lists);

		Collections.swap(lists, 0, lists.size() - 1);
		System.out.println(lists);

		Collections.rotate(lists, 3);
		System.out.println(lists);

		Map<String, Long> maps = lists.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		String[] keys = maps.entrySet().stream().filter(key -> key.getValue() % 2 == 0).map(key -> key.getKey())
				.toArray(String[]::new);

		for (String key : keys) {
			System.out.println(key);
		}

		String[][] arrays2d = { { "a", "a", "a" }, { "b", "b", "b" }, { "c", "c", "d" }, { "d", "e", "f" } };

		List<String[]> lists2d = new ArrayList<>(Arrays.asList(arrays2d));

		System.out.println(lists2d);

		ListIterator iterator = lists2d.listIterator();
		while (iterator.hasNext()) {
			String[] array = (String[]) iterator.next();
			System.out.println("Elem");

			for (String elem : array) {
				System.out.println(elem);
			}

		}

	}
}
