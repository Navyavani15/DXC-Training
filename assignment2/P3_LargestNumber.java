
//3. Write a function to get largest number in the given array.

package javaprograms;

import java.util.Scanner;

public class P3_LargestNumber{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int temp=0;
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter "+(i+1)+" element ");
			a[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			for(int k=j;k<n;k++)
			{
				  if(a[j]<a[k])
				  {
					  temp=a[k];
					  a[j]=a[k];
				  }
				  
			}
		}
		
			System.out.print(temp+" is the largest number ");
		
		
	}

}
