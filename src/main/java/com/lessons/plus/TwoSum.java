package com.lessons.plus;

public class TwoSum {
	public int[] findTwoSum(int[] numbers, int target) {

		for (int i = 0, diff = 0; i < numbers.length; i++) {

			diff += target - numbers[i];

			if (diff > 0) {

				for (int j = i + 1; j < numbers.length; j++) {
					if (numbers[i] + numbers[j] == target) {
						return new int[] { i, j };
					}
				}
			}
		}
		return null;
	}

}