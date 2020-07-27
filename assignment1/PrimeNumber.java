package assignment_1;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[])
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%2==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(n +" is a prime number");
		}
		else
		{
			System.out.println(n +" is not a prime number");
		}
		sc.close();
		
	}

}
