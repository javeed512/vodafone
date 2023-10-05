package exp;

public class ExpDemo {

	public static void main(String[] args) {


		System.out.println("Open File");
		System.out.println("Reading File");
		
		String name = "hello";
		
		
		try {
			System.out.println("Writing Data to File "+div(10,2));
			System.out.println(name.length());
			System.out.println(name.charAt(10));
		}
		catch(ArithmeticException e) {
			
			e.printStackTrace(); 
			System.err.println("Sorry! You can't div number by zero");
			
		}
		catch(NullPointerException ne) {
			
			ne.printStackTrace();
			
		}
		catch(Exception e) {
			
			System.err.println("Some Excetion occur");
			e.printStackTrace();
			
		}
		
		
		finally {
		System.out.println("Close File");
		}
		
		System.out.println("Thank you");
	}
	
	public static int div(int a,int b)throws ArithmeticException {
		
		return a/b;
	}

}
