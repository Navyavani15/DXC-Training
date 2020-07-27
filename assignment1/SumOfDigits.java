package assignment_1;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String args[])
	{
		int sum=0,r=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("entre a number");
		int num=sc.nextInt();
		int n=num;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("sum of digits of "+num+" is "+sum);
	}

}
