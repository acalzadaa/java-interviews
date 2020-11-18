package com.lessons.plus;

import java.util.ArrayList;
import java.util.Arrays;

public class JadenCase {

	public static String toJadenCase(String phrase) {

		if (phrase.length() == 0) {
			return null;
		} else {
			StringBuilder sb = new StringBuilder();

			new ArrayList<String>(Arrays.asList(phrase.split(" "))).stream().forEach(word -> {
				sb.append(Character.toUpperCase(word.charAt(0)) + word.substring(1)).append(" ");
			});

			return sb.toString().stripTrailing();
		}

	}

}