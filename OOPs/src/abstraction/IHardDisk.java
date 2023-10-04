package abstraction;

public interface IHardDisk {
	
	
	String  size();
	double  price();
	
	public static void m1() {
		
		System.out.println("static method from interface");
	}
	
	public default void m2() {
		
		System.out.println("default method from interface");
		
	}
	

}
