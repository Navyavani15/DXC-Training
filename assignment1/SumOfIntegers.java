package Assignment1;

import java.util.Scanner;

public class SumOfIntegers {
	public static void main(String args[])
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("entre a number");
		int num=sc.nextInt();
		int n=num;
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
			
		}
		
		if(sum>9)
			{
				sum=sum/10+sum%10;
			}
		System.out.println("sum of digit of "+num+" is "+sum);
		sc.close();
	}

}
