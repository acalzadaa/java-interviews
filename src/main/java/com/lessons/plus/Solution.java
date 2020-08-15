package com.lessons.plus;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public String whoLikesIt(String... names) {
		String postFix = " like this";
		String postFixPlural = " likes this";

		if (names.length == 0) {
			return "no one" + postFixPlural;
		}

		List<String> listedNames = new ArrayList<>();
		for (String name : names) {
			listedNames.add(name);
		}

		switch (names.length) {
		case 1:
			return listedNames.get(0) + postFixPlural;
		case 2:
			return listedNames.get(0) + " and " + listedNames.get(1) + postFix;
		case 3:
			return listedNames.get(0) + ", " + listedNames.get(1) + " and " + listedNames.get(2) + postFix;
		default:
			return listedNames.get(0) + ", " + listedNames.get(1) + " and " + (listedNames.size() - 2) + " others"
					+ postFix;
		}

	}
}
