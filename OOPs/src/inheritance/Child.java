package inheritance;

public class Child extends Parent { // IS A Relationship inheritance
	
	int cid = 99;
	
		
	
		public Child() {
			super();
			System.out.println("Child() is called");
		}
	
		@Override
		public String toString() {
			
			return "hello javeed";
		}
		
	
		public void m2() {
			
			System.out.println("m2() from Child class");
			
		}
		
		@Override
		public void m1() {
			
			System.out.println("m1() from Child class overriden");
			
		}
	
		
		
		public static void main(String[] args) {
			
			
			Child c1 = new Child();
			
			System.out.println(c1.cid);
			
			 c1.m2();
			
			 System.out.println(c1.pid);
			 
			 c1.m1();
			 
			 System.out.println(c1.toString());
			 
			 Object o = new Object();
			 
			 Parent p = new Parent();
			 
			 Child c = new Child();
			 
			 	Parent p1 = new Child(); // Runtime Polymorphism
			 
			 
			 
			
			
		}
		
		
		

}
