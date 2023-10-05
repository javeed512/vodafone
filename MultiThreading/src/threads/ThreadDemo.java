package threads;

public class ThreadDemo extends Thread { // IS-A Relationship 

	public static void main(String[] args) { // Main- Thread

		ThreadDemo t1 = new ThreadDemo(); // thread-object

		t1.setName("Child1");
		t1.setPriority(5);

		System.out.println(t1);

		t1.start(); // internally invoke run();

		ThreadDemo t2 = new ThreadDemo();
		t2.setName("Child2");
		t2.setPriority(5);
		System.out.println(t2);

		t2.start();

		/*
		 * for (int i = 0; i < 5; i++) {
		 * 
		 * System.out.println("main "+i); }
		 */

	}

	public void run() {

		// thread specific logics

		for (int i = 0; i < 5; i++) {

			System.out.println(Thread.currentThread().getName());
		}

	}

}
