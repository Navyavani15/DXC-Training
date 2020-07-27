package java_Programs;

public class A3_P4_Giftcard {
		private long cardNo;
		private double balance;
		private boolean active;
		
		public A3_P4_Giftcard()
		{
			super();
			this.balance=0.0;
		}
		public A3_P4_Giftcard( long cardNo,double balance, boolean active)
		{
			super();
			this.cardNo = cardNo;
			this.balance = balance;
			this.active = active;
			
			
		}
		public void reachargeCard(double amount)
		{
			if(this.active==true)
			{
				this.balance+=amount;
				System.out.println("card reachered sucessful with RS."+balance);
				
			}
			else 
			{
				System.out.println("card is inactive");
			}
			
		}
		public void swipeCard(double amount)
		{
			if(this.active==true)
			{
				if (this.balance > amount)
				{
					this.balance = this.balance - amount;
					System.out.println("Rs."+amount+" Swiped sucessful");
				}
				else{
					System.out.println("Insufficient balance! can not swipe Rs."+amount);
				}
			}
			else
			{
				System.out.print("card is inactive");
			}
			
		}
		public long getCardNo() {
			return cardNo;
		}
		public void setCardNo(long cardNo) {
			this.cardNo = cardNo;
		}
		public double getBalance() {
			return balance;
		}
		
		public boolean isActive() {
			return active;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		
	

}
