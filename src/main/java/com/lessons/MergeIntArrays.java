package com.lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeIntArrays {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 0, 0, 0 };
		int[] b = { 2, 4, 6 };

		System.out.println(Arrays.toString(mergeArrays(a, b)));
	}

	private static int[] mergeArrays(int[] a, int[] b) {

		List<Integer> integers = new ArrayList<>();

		integers.addAll(Arrays.stream(a).boxed().collect(Collectors.toList()));
		integers.addAll(Arrays.stream(b).boxed().collect(Collectors.toList()));

		return integers.stream().mapToInt(i -> i).toArray();
	}

}
