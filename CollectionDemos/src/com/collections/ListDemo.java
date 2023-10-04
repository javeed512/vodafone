package com.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class ListDemo {

	public static void main(String[] args) {


		List<Object>	list =	new ArrayList<Object>();
		
				list.add(new String("java"));
				list.add(50);  // new Integer(50);
				list.add(4.5); // new Double(4.5);
				list.add(50);
				list.add(null);
		
		System.out.println(list);
		
				for(Object obj:list) {
					
					System.out.println(obj);
					
				}
		
		
		
		    List<Integer> list2 = new LinkedList<Integer>();
		
		    		list2.add(10);
		    		list2.add(30);
		    		list2.add(40);
		    		list2.add(20);
		    		list2.add(30);
		    		
		    		System.out.println(list2);
		    		
		    	Iterator<Integer> it =	list2.iterator();
		    	
		    	while(it.hasNext()) {
		    		
		    	Integer i =	it.next();
		    	System.out.println(i);
		    		
		    	}
		    	
				/*
				 * while(it.hasNext()) {
				 * 
				 * Object obj = it.next();
				 * 
				 * Integer i = (Integer) obj; // explicit type casting System.out.println(i);
				 * 
				 * }
				 */
		    	

	}

}
