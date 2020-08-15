package com.lessons.plus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Count the number of vowels in a string of letters only, regardless of the case 
 */
public class Vowels {

	public int getCount(String str) {
		List<String> letters = new ArrayList<>(Arrays.asList(str.toLowerCase().split("")));
		int vowelCount = letters.stream().filter(vowels -> vowels.matches("[aeiou]")).collect(Collectors.toList())
				.size();
		return vowelCount;
	}
}
