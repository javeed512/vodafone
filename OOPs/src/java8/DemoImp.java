package java8;

public  class DemoImp implements MyInterface {

	
	
	
	public static void main(String[] args) {
		
		
		MyInterface	demo =	new DemoImp();
		
		int res =	demo.add(5, 5);
		System.out.println(res);

	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
