package assignment_1;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
			System.out.println("entre a value");
			int n=sc.nextInt();
			int temp=n;
		while(n>0)
		{
			sum=sum*10+n%10;
			n=n/10;
		}
		
		if(temp==sum)
		{
			System.out.println(temp+" is a palindrome");
		}
		else
		{
			System.out.println(temp+" is not a palindrome");
		}
	}

}
