package deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import serialization.Product;

public class DeserializationDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("Product.ser");
			
		    ois = new ObjectInputStream(fis);
		    
		  Object obj =  ois.readObject();
		  
		  	Product product = (Product) obj; // explicit type casting
		  	
		  	System.out.println(product);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
