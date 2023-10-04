package java8;

public class HelloWorld {

	public static void main(String[] args) {


	MyInterface mi = (int a, int b) -> { return a+b; }; // Lambda Expression
													// anonymous func
			System.out.println(mi.add(4, 5));
			
	}

}
