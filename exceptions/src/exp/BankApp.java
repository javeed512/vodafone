package exp;

public class BankApp {

	public static void main(String[] args) {


		int accounts[] = {1,2,3,4};
		String names[] = {"adam","smith","tom","ford"};
		double balance[] = {40000,30000,1000,50000};
		
		System.out.println("Welcome to Vodafone bank");
		for (int i = 0; i < accounts.length; i++) {
			
System.out.println(accounts[i] +" "+names[i]+"  "+balance[i]);

				if(balance[i] < 1000) {
					
					try {
					throw new LowBalanceException();
					}
					catch (LowBalanceException e) {
					
						System.err.println(names[i]+" Your balance is low , please deposit some amount");
					}
				}

			
		}
		
		

	}

}
