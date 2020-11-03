package com.lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeStringArrays {

	public static String[] uniqueNames(String[] names1, String[] names2) {

		ArrayList<String> listOfNames = new ArrayList<>();

		listOfNames.addAll(Arrays.asList(names1));
		listOfNames.addAll(Arrays.asList(names2));

		// eliminate the repeated ones
		Set<String> uniqueListOfNames = new HashSet<>(listOfNames);

		return uniqueListOfNames.stream().toArray(String[]::new);

	}

	public static void main(String[] args) {
		String[] names1 = new String[] { "Ava", "Emma", "Olivia" };
		String[] names2 = new String[] { "Olivia", "Sophia", "Emma" };
		System.out.println(String.join(", ", MergeStringArrays.uniqueNames(names1, names2))); // should print Ava, Emma,
																						// Olivia, Sophia
	}
}