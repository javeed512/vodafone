package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemos {

	public static void main(String[] args) {


		Set<Integer>  set1 =		new HashSet<Integer>();
		
			set1.add(30); 
			set1.add(20);
			System.out.println(set1.add(40)); 	
			set1.add(10); 
			System.out.println(set1.add(40));
			
			System.out.println(set1);
			
			Set<String>  set2 =		new HashSet<String>();
			
			set2.add("B"); 
			set2.add("C");
			set2.add("D"); 	
			set2.add("A");  
			
			System.out.println(set2);
			
			Iterator<String> it = set2.iterator();
			
			while (it.hasNext()) {
				String item =  it.next();
				System.out.println(item);
				
			}
			
		
	}

}
