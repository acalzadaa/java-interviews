package com.lessons.plus;

public class ValidPhoneNumber {

	public static void main(String[] args) {
	}

	public static boolean validPhoneNumber(String phoneNumber) {
		return phoneNumber.matches("(\\()([1-9]{1}[0-9]{2})(\\))(\\s)([0-9]{3})(\\-)([0-9]{4})");
	}

}
