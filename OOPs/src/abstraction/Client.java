package abstraction;

public class Client {

	public static void main(String[] args) {


		IHardDisk  hd =	new HardDiskImp2();
		
			System.out.println("Size "+hd.size());
			System.out.println("Price "+hd.price());
			
			IHardDisk.m1();
			
			hd.m2();
			

	}

}
