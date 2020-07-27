package assignment_1;

import java.util.Scanner;

public class Ncr {
	public static void main(String args[])
	{
	int n1=1;
	int n2=1;
	int j=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n and r:");
			int n=sc.nextInt();
			int r=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			n1=n1*i;
			while(j<=(n-r))
			{
				n2=n2*j;
				j++;
			}
		}
	System.out.println(n+"c"+r+" = "+(n1/(n2*r))); //ncr = ( n! / ( (n-r)! * r)
		
	}

}
