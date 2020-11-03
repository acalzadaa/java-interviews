package com.lessons.plus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

class CollectionsFrenzyTest {

	@Test
	void test2() {

	}

	@Test
	void test() {
		List<String> basic = new ArrayList<>();
		basic.add("hola");
		basic.add("adios");
		basic.add("hola2");
		basic.add("adios2");
		basic.add("hola3");
		basic.add("adios3");
		basic.add("hola4");
		basic.add("adios4");
		basic.add("hola5");
		basic.add("adios5");

		List<String> basic2 = new ArrayList<>();
		basic2.add("adios");

//		basic.retainAll(basic2);
//		System.out.println(basic.toString());

		Iterator<String> basicIterator = basic.iterator();
		basicIterator.forEachRemaining(System.out::println);

		basicIterator = basic.iterator();
		while (basicIterator.hasNext()) {
			System.out.println("2nd: " + basicIterator.next());
		}

		basicIterator = basic.listIterator(basic.size() / 2);
		while (basicIterator.hasNext()) {
			System.out.println("3rd: " + basicIterator.next());
		}

	}

}
