package java_Programs;


	public class AccountClient {

		public static void main(String[] args) {
			
			Account client1 = new Account("Active", 5000.0, 2500);
			client1.depositAmount();
			System.out.println();
			Account client2 = new Account("Inactive", 10000.0, 900);
			client2.depositAmount();
			System.out.println();
			Account client3 = new Account("active", 15000.0, 9500);
			client3.depositAmount();
			
			

		}

	}
