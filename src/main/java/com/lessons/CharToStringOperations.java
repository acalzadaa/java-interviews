package com.lessons;

import java.util.Set;
import java.util.stream.Collectors;

public class CharToStringOperations {

	public static void main(String[] args) {

		System.out.println(compress("aaaabbbbbbbcc"));

	}

	private static String compress(String sequence) {
		Set<Character> chars = sequence.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
		String str = chars.stream().map(String::valueOf).collect(Collectors.joining());
		return str;
	}

}
