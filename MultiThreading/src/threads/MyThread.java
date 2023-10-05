package threads;

public class MyThread  implements Runnable{

	public static void main(String[] args) {


		Runnable t1 = new MyThread();
		
		Thread td1 = new Thread(t1); // Has A Relationship
				td1.setName("Dhoni");
				
			System.out.println(td1);
			
			
			Runnable t2 = new MyThread();
			
			Thread td2 = new Thread(t2,"Kholi"); // Has A Relationship
					
			
				System.out.println(td2);
				
				td1.start();
				td2.start();

	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {

			System.out.println(Thread.currentThread().getName());
		}
	}

}
