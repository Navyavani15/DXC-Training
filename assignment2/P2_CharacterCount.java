//2. program to count how many numbers of times each character appears/present in the given string.

package javaprograms;

public class P2_CharacterCount {
	public static void main(String args[])
	{
		String s="hello world"; 
		int count[]=new int[s.length()];
		int i,j;
		char String[]=s.toCharArray();
		for(i=0;i<s.length();i++)
		{
			count[i]=1;
			for(j=i+1;j<s.length();j++)
			{
				if(String[i]==String[j])
				{
					count[i]++;
					String[j]='0';
					
				}
			}
		}
		System.out.println("character frequency");
		for(i=0;i<s.length();i++)
		{
			if(String[i]!=' ' && String[i]!='0')
	
		System.out.println(String[i]+"-"+count[i]);
		}
	}
}



