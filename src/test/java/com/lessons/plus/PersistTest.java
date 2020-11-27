package com.lessons.plus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lessons.plus.Persist;

public class PersistTest {

	@Test
	public void BasicTests() {
		System.out.println("****** Basic Tests ******");
		Assertions.assertEquals(3, Persist.persistence(39));
		Assertions.assertEquals(0, Persist.persistence(4));
		Assertions.assertEquals(1, Persist.persistence(12));
		Assertions.assertEquals(2, Persist.persistence(25));
		Assertions.assertEquals(4, Persist.persistence(999));
		Assertions.assertEquals(1, Persist.persistence(164940));
		Assertions.assertEquals(1, Persist.persistence(160943));

	}

}