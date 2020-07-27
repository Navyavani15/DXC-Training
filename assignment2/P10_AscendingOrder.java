//10. Write a program in take 10 integer in an array and sort in ascending order.


package javaprograms;
import java.util.*;
public class P10_AscendingOrder {
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("entre number of elements to be sort ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int l=0;l<n ;l++ )
		{
			System.out.print("Enter "+(
					l+1)+" element ");
			a[l]=sc.nextInt();

		}
		
		System.out.println(" ");
	int temp=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.print(" Ascending order : ");
		for (int p=0;p<n ;p++ )
		{
			System.out.print(+a[p]+" ");

		}

	}

}
