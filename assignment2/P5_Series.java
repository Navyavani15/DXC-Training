/*5. Write a program to generate the first n terms in the series
1, 8, 27, 64, 125*/
package javaprograms;

import java.util.Scanner;

public class P5_Series {
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter  series limit  ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int sum=0,r;
			r=i*i*i;
			sum=sum+r;
			System.out.print(sum+",");
			sum=0;

		}
	}
	

}
