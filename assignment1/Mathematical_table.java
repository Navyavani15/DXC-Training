package assignment_1;

import java.util.Scanner;

public class Mathematical_table {
	public static void main(String args[])
	{
		System.out.print("Enter the number ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=1;
		System.out.println("mathematical table of "+num+":");
		while(i<11)
		{
			System.out.println(num+" X "+i+" = "+(i*num));
			i++;
		}
	}

}
