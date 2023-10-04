package com.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LHSDemo {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<Integer>();

		set.add(30);
		set.add(20);
		set.add(40);
		set.add(10);
		set.add(20);
		
		System.out.println(set);

	}

}
