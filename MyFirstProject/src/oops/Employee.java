package oops;

import java.lang.*;

public class Employee extends Object{

		int employeeId;
		String ename;
	
		static  double salary ;
		
	public Employee() {
		
		super();// Object();
		
		System.out.println("Employee() is called object created..");
		
	}
	
	public static void main(String[] args) {
		
		int id = 0 ;
		String city = null;
		double salary = 0.0; 
		
		salary = 2000;
		
		System.out.println(id);
		System.out.println(city);
		
	Employee e1 = 	new Employee();
	
	System.out.println(e1.toString());
	
	System.out.println("Print Instance vars");
	System.out.println(e1.employeeId);
	System.out.println(e1.ename);
	System.out.println(Employee.salary);
		
	int result =	e1.add(4,5);
	
	System.out.println("Result "+result);
	

	}
	
	public int add(int a, int b) {
		
		return a+b;
		
	}
	
	
	
}
