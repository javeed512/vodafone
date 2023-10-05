package readingkb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Enter Name");
			String name = br.readLine();
			System.out.println(name);
			
			System.out.println("Enter salary");  // "4000"
				String str =	br.readLine();  
			int salary = Integer.parseInt(str);
				System.out.println(salary);
				

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
