package com.lessons.plus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseOnly5LenWords {

	public static String reverseWords(String phrase) {
		StringBuilder sb = new StringBuilder();
		StringBuilder sbReverse = new StringBuilder();
		List<String> words = new ArrayList<>(Arrays.asList(phrase.split(" ")));

		for (String word : words) {
			sb.append(word.length() >= 5 ? sbReverse.append(word).reverse() : word);
			sbReverse.setLength(0);
			sb.append(" ");
		}

		return sb.toString();
	}

}
