package com.alex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UniqueNameTest {

	@Test
	void testUniqueNames() {
		UniqueName unique = new UniqueName();
		Assertions.assertEquals(unique.firstUniqueName(new String[] { "Abbi", "Adeline", "Abbi", "Adalia" }),
				"Adeline");
	}

}
