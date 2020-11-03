package com.lessons.plus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Count the number of vowels in a string of letters only, regardless of the case 
 */
public class Vowels {

	public int getCount(String str) {
		List<String> letters = new ArrayList<>(Arrays.asList(str.toLowerCase().split("")));
		long vowelCount = letters.stream().filter(vowels -> vowels.matches("[aeiou]")).count();
		return (int) vowelCount;
	}
}
