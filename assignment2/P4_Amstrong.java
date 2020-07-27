//4.Write a program to find whether a given 3 digit number is an Armstrong number or not.

package javaprograms;

import java.util.Scanner;

public class P4_Amstrong {
	public static void main(String args[])
	{
		int sum=0,r,temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a value ");
		int n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			sum=sum*10+n%10;
			n=n/10;
		}
		
		if(temp==sum)
		{
			System.out.println(temp+" is a Amstrong number");
		}
		else
		{
			System.out.println(temp+ " is  Not a Amstrong number");
		}
	}

}
