package java_Programs;

import java.util.Scanner;

public class A3_P2_AccountTest {
	public static void main(String args []) {
		
		Scanner sc=new Scanner(System.in);

		A3_P2_Account acc=new A3_P2_Account();
		System.out.print("Enter the Account_number : ");
		long accoutNo=sc.nextLong();
		acc.setAccoutNo(accoutNo);
		System.out.print("Enter the balance :  ");
		double balance=sc.nextDouble();
		acc.setBalance(balance);
		System.out.print("Enter the money to be deposited : ");
		double deposite=sc.nextDouble();
		acc.setDeposit(deposite);
		System.out.print("Enter  withdrawn amount ") ;
		double witd=sc.nextDouble();
		acc.withdraw(witd);
		System.out.print("Current balance " +acc.getBalance());
		
		
	}
			
		

	
			

}

