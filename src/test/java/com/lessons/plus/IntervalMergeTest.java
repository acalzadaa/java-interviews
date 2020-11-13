package com.lessons.plus;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lessons.plus.IntervalMerge.Pair;

class IntervalMergeTest {

	@Test
	void test() {
		Pair result = IntervalMerge.merge(new ArrayList<Pair>(
				List.of(new Pair(8L, 10L), new Pair(9L, 12L), new Pair(15L, 18L), new Pair(16L, 25L))));
		Assertions.assertEquals(15, result.getStart());
		Assertions.assertEquals(25, result.getEnd());

	}

}
