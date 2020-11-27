package com.lessons.plus;

import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/* receive a list of objects, each having a range of two integer numbers and find out the largest overlap of them 
 * return the biggest overlap pair 
 */

@Data
public class IntervalMerge {

	public static void main(String[] args) {

	}

	@Data
	public static class Pair implements Comparable<Pair> {

		private final Long start;
		private final Long end;

		public Pair(Long start, Long end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Pair p) {
			if (p.start == start) {
				return 0;
			}
			if (p.start < start) {
				return 1;
			}
			return -1;
		}

	}

	public static Pair merge(List<Pair> pairs) {

		if (pairs.isEmpty()) {
			return new Pair(0L, 0L);
		}

		if (pairs.size() == 1) {
			return pairs.get(0);
		}

		Collections.sort(pairs);

		Pair lastPair = pairs.get(0);
		Pair currentPair;
		long currentLength = 0;
		long maxLength = 0;
		long start = -1;
		long end = -1;

		for (int i = 1; i < pairs.size(); i++) {

			currentPair = pairs.get(i);

			if (currentPair.getStart() < lastPair.getEnd()) {
				System.out.println("Match! " + currentPair + " " + lastPair);
				currentLength = currentPair.getEnd() - lastPair.getStart();
				maxLength += currentLength;
				end = currentPair.getEnd();
				start = start < 0 ? lastPair.getStart() : -1;
				System.out.println("Start: " + start + " End: " + end + " CurrentL: " + currentLength + " MaxLength: "
						+ maxLength);

			} else {
				System.out.println("Reset!");
				start = -1;
				end = -1;
			}

			lastPair = currentPair;
		}

		return new Pair(start, end);

	}

}
