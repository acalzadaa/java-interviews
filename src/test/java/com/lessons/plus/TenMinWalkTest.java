package com.lessons.plus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TenMinWalkTest {
	@Test
	public void Test() {
		Assertions.assertEquals(true,
				TenMinWalk.isValid(new char[] { 'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's' }));
		Assertions.assertEquals( false,
				TenMinWalk.isValid(new char[] { 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e' }));
		Assertions.assertEquals( false, TenMinWalk.isValid(new char[] { 'w' }));
		Assertions.assertEquals( false,
				TenMinWalk.isValid(new char[] { 'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's' }));
	}
}