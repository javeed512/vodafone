package map;

public class Product {
	
	private int pid;
	private String pname;
	
	
	public Product(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}


	@Override
	public String toString() {
		return  pname;
	}
	
	
	

}
