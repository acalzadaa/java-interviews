package com.alex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Complete the solution so that it splits the string into pairs of two characters. 
 * If the string contains an odd number of characters then 
 * it should replace the missing second character of the final pair with an underscore ('_').
 */

public class StringSplit {

	public String[] solution(String s) {

		List<String> chainOfLetters = new ArrayList<>(Arrays.asList(s.split("")));
		List<String> returnChain = new ArrayList<>();

		for (int a = 1; a <= s.length() / 2; a++) {
			returnChain.add(chainOfLetters.get((a * 2) - 2) + chainOfLetters.get((a * 2) - 1));
		}

		if (s.length() % 2 != 0) {
			returnChain.add(chainOfLetters.get(s.length() - 1) + "_");
		}

		return returnChain.toArray(new String[returnChain.size()]);
	}

}
