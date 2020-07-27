package assignment_1;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String args[])
	{
		int sum=1;
		System.out.println("enter factorial number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=5;i++)
		{
			sum=sum*i;
		}
		System.out.println(n+ "! = "+sum);

	}

}
