package com.lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeStringArrays2 {

	public static String[] uniqueNames(String[] names1, String[] names2) {

		List<String> listOfNames1 = new ArrayList<>(Arrays.asList(names1));
		List<String> listOfnames2 = new ArrayList<>(Arrays.asList(names2));

		listOfNames1.addAll(listOfnames2);

		// eliminate the repeated ones
		Set<String> uniqueListOfNames = new HashSet<>(listOfNames1);

		String[] arrayOfNames = uniqueListOfNames.stream().toArray(String[]::new);

		return arrayOfNames;
	}

	public static void main(String[] args) {
		String[] names1 = new String[] { "Ava", "Emma", "Olivia" };
		String[] names2 = new String[] { "Olivia", "Sophia", "Emma" };
		System.out.println(String.join(", ", MergeStringArrays2.uniqueNames(names1, names2))); // should print Ava, Emma,
																						// Olivia, Sophia
	}
}