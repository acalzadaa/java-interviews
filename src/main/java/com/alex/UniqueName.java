package com.alex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UniqueName {
	public String firstUniqueName(String[] names) {

		List<String> uniqueNames = new ArrayList<>();

		HashMap<String, Integer> unique = new HashMap<>();

		for (int i = 0; i < names.length; i++) {

			if (unique.containsKey(names[i])) {
				unique.replace(names[i], unique.get(names[i]) + 1);
			} else {
				unique.put(names[i], 1);
			}

		}

		for (String key : unique.keySet()) {
			if (unique.get(key) == 1)
				return key;
		}

		return null;

	}

}