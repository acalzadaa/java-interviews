package com.lessons.plus;

import java.util.Arrays;

public class Consecutive {

	public static void main(String[] args) {
		
		int[] numbers = {1,4,6,9};
		System.out.println(Consecutive.find(numbers));
		
	}
	
	public static int find(final int[] arr) {
		return arr.length > 0 ? Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt() - arr.length +1 :0;
	}
}
