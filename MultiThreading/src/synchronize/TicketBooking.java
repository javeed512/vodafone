package synchronize;

public class TicketBooking implements Runnable{

	static int tickets = 1;
	
	public static void main(String[] args) {

			
			TicketBooking  ticket = new TicketBooking();
		
				Thread passanger1 = new Thread(ticket,"Satish");
				Thread passanger2 = new Thread(ticket,"Raju");
			
				
			
					passanger1.start();
					passanger2.start();
			
				
	}

	@Override
	public synchronized void run() {
		System.out.println("No. of Tickets Before: "+tickets);

		if(tickets > 0) {
		
		System.out.println("Ticket is confirmed for "+Thread.currentThread().getName());
		
		tickets = tickets -1;
		
		}
		else {
			
			System.err.println("Sorry "+ Thread.currentThread().getName() +" try next time");
		}
		
		
		System.out.println("No. of Tickets After: "+tickets);		
		
	}

}
