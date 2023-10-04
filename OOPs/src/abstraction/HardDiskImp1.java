package abstraction;

public abstract class HardDiskImp1 implements IHardDisk {

		public String size(){
			
			return "500GB";
			
		}
		
		public abstract double price();
	
}
