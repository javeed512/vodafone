package com.vodafone.pojo;

public class Main {

	public static void main(String[] args) {

		
		Employee e1 = new Employee(101, "javeed", 50000);
		
		System.out.println(e1.getEid());
		
		
		System.out.println(e1);
		
		
		
		Employee e2 = new Employee(); // HAS A Relationship
		e2.setEid(102);
		
	
		System.out.println(e2.getEid());
		
		
		String str1 = new String("hello");
		
		System.out.println(str1.toString());
		
		
		

	}

}
