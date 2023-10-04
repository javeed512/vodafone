package oops;

public class Student {
	
	//static int sid;
	//static String sname;
	int sid;
	String sname;
	
	public Student() {
		super();
		System.out.println("Student() is called..");
		
	}
	
	
	
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname; 
	}



	public static void main(String[] args) {
		
		
			Student s1 = new Student();
			s1.sid = 101;
			s1.sname = "Aditya";
			
			
			System.out.println(s1.toString());
			System.out.println(s1.sid+"  "+s1.sname );
			
			Student s2 = new Student(102, "Javeed");
			
			System.out.println(s2);
			System.out.println(s2.sid +" "+s2.sname);
			
			
			
		
		
	}
	
	
	int  add(int a,int b) {
		
		return a+b;
	}
	
	long  add(int a,int b,int c) {
		
		return a+b+c;
	}
	

}
