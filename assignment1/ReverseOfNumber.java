package assignment_1;

import java.util.Scanner;

public class ReverseOfNumber {
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
			System.out.println("Entre a value");
			int n=sc.nextInt();
			System.out.print("reverse of value ");
		while(n>0)
		{
		System.out.print(n%10);
		n=n/10;
		}
	}
}
