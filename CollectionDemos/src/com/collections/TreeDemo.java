package com.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeDemo {

	public static void main(String[] args) {


		Set<String>  set =	new TreeSet<String>();
				
		set.add("B"); 
		set.add("C");
		set.add("D"); 	
		set.add("A");
		set.add("D"); 
		
		System.out.println(set);
		
		
		
		Set<Integer> set1 = new TreeSet<Integer>();

		set1.add(30);
		set1.add(20);
		set1.add(40);
		set1.add(10);
	
		
		System.out.println(set1);
		
		
	

	}

}
