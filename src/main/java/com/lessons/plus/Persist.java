package com.lessons.plus;

public class Persist {

	public static int persistence(long number) {

		if (number < 10) {
			return 0;
		}

		int acum = 1;
		long result = 0;
		long reminder = 0;
		while (number > 0) {
			result = number / 10;
			reminder = number % 10;
			acum *= reminder;
			if (reminder == 0) {
				return 1;
			}

			number -= reminder;
			number /= 10;

		}

		return 1 + persistence(acum);
	}

}
