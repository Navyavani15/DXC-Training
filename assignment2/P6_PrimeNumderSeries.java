//6. Write a program to generate the first n prime numbers in the series
package javaprograms;
import java.util.*;
public class P6_PrimeNumderSeries {
	
		public static void main(String args[]) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("entre a value to gentare  first n prime numbers  ");
			int n=sc.nextInt();
			System.out.print("prime numbers up to "+n+" : "); 
			for(int i=2;i<=n;i++)
			{
				int count=0;
				for(int j=2;j<i-1;j++)
				{
					if(i%j==0)
					{

					count++;
					}
				}
			
				if(count==0)
				{
				
				System.out.print(i+" ");
				}
			}
		}
	}

