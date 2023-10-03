package arrays;

public class ArrayDemo {

	public static void main(String[] args) {

			int ar1[] = {101,102,103,104,105};
			
			System.out.println(ar1.length); 
			
			//System.out.println(ar1[0]);
			
			System.out.println("For Loop");
			for (int i = 0; i < ar1.length; i++) {
				
				System.out.println(ar1[i]);
				
			}
			
			System.out.println("For Each Loop");
			
			for(int x: ar1) {   // for each loop can be used with any collection
				
				System.out.println(x);
			}
			
			
			String  names[] = new String[4];
			names[0] = "javeed";
			names[1] = "smith";
			
			
			for(String s: names) {
				
				System.out.println(s);
				
			}
			
			
			
			int ar2[] = new int[3];
		

	}

}
