package javaprograms;

import java.util.Scanner;

public class P1_RemoveDuplicate {

	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of  elements into array ");
		int n=sc.nextInt();
		int a[]=new int[n];

		for(int l=0;l<n;l++)
		{
			System.out.print("Enter "+(l+1)+" element into array ");
			a[l]=sc.nextInt();
		}
		
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						
						while(j<n-1)
						{
							a[j]=a[j+1];
							j++;
						}
						j--;
						n--;
					}
				}
			}
		int temp[]=new int[n];
		for(int i=0;i<n;i++)
		{
				temp[i]=a[i];
			}
			for(int i=0;i<temp.length;i++)
			{
				System.out.println(temp[i]);
			}
		}
	}

