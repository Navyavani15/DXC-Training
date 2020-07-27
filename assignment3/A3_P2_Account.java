package java_Programs;

public class A3_P2_Account {
	private long accoutNo;
	double balance;
	double deposit;
	
	
	public long getAccoutNo() {
		return accoutNo;
	}


	public void setAccoutNo(long accoutNo) {
		this.accoutNo = accoutNo;
	}


	public double getBalance() {
		return balance;
	}
	public void withdraw(double withdraw) {
		if (this.balance > withdraw)
		{
			this.balance = this.balance - withdraw;
		}
		else{
			System.out.println("Insufficient balance!");
		}
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getDeposit() {
		return deposit;
	}


	public void setDeposit(double deposit) {
		this.balance = this.balance+deposit;
	}

}
