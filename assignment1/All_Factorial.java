package assignment_1;

import java.util.Scanner;

public class All_Factorial {
	public static void main(String args[])
	{
		int sum=1;
		int count=0;
		System.out.println("enter factorial number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			sum=sum*i;
			System.out.print(i+"! = "+sum+" ");
			for(int j=1;j<sum;j++)
			{
				if(sum%2==0)
				{
				count++;
				}	
			}
			if(count==0 || sum==2)
			{
			System.out.println(" is a prime number");
			}
			else
			{
			System.out.println(" is not a prime number");
			}
			
		}
		sc.close();
	
	}

}
