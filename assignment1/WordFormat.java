package assignment_1;

import java.util.Scanner;

public class WordFormat {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("entre the value");
		int n=sc.nextInt();
		if(n<10)
		{
		String ones[]={"Zero", "One","Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen"};
		System.out.println(	ones[n]);
		}
		else
		{
			System.out.println("enter value between 0 to 9");
		}
	
	}

}
