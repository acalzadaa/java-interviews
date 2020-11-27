package com.lessons.plus;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Consecutive {

	public static void main(String[] args) {
		
		int[] numbers = {1,4,6,9};
		System.out.println(Consecutive.find(numbers));
		
	}
	
	public static int find(final int[] arr) {
		
		if(arr.length <= 1) {
			return 0;
		}

		List<Integer> numbers = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Collections.sort(numbers);
		
		if(numbers.size() == 2) {
			return numbers.get(numbers.size()-1) - (numbers.get(0)+1);
		}
		
		int end = numbers.get(numbers.size()-1);
		int start = numbers.get(0);
		
		numbers.addAll(IntStream.range(start,end+1).boxed().collect(Collectors.toList()));
		
		Map<Integer, Long> numbersMap = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		return (int) numbersMap.entrySet().stream().filter(keys -> keys.getValue() == 1).count();
	}
}