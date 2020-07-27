/*7. Program to print the given pattern
1 2 3 4 5
1 2 3 4
1 2 3
1 2 
1*/

package javaprograms;

public class P7_Pattern {
		public static void main(String args[])
		{
			
			for(int i=5;i>=1;i--)
			{
				int n=1;
				for(int j=i;j>=1;j--)
				{
					System.out.print(n+" ");
					n++;
				}
				
				System.out.println(" ");

			}
		}

	}

