package com.alex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void staticTests() {
		Solution solution = new Solution();

		assertEquals("no one likes this", solution.whoLikesIt());
		assertEquals("Peter likes this", solution.whoLikesIt("Peter"));
		assertEquals("Jacob and Alex like this", solution.whoLikesIt("Jacob", "Alex"));
		assertEquals("Max, John and Mark like this", solution.whoLikesIt("Max", "John", "Mark"));
		assertEquals("Alex, Jacob and 2 others like this", solution.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
		assertEquals("Alex, Jacob and 3 others like this", solution.whoLikesIt("Alex", "Jacob", "Mark", "Max", "Sam"));
		assertEquals("Alex, Jacob and 4 others like this",
				solution.whoLikesIt("Alex", "Jacob", "Mark", "Max", "Sam", "Conny"));

	}

}
