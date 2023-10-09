package com.vodafone.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@ComponentScan("com.vodafone.springcore")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
    ApplicationContext container = new AnnotationConfigApplicationContext(App.class);
        
    Employee emp =	 container.getBean(Employee.class);
    	
    System.out.println(emp);
    System.out.println(emp.getAddress());
    
    Address a1 = container.getBean(Address.class);
    
    System.out.println("Address: " +a1);
        
    }
}
