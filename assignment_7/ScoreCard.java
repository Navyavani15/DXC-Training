package assignment_7;


import java.util.*;
import java.util.Map.Entry;

public class ScoreCard {
	private static Integer maxRun;
	public static int getMaxRun() {
		return maxRun;
	}


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Map<String,Integer> m=new HashMap<String,Integer>(); 
		Scanner sc=new Scanner(System.in);
		int total=0;
		 maxRun = 0 ;
		System.out.println("enter number of batsmen : ");
		int n=sc.nextInt();
		System.out.println("Enter Runs Scored");
		for(int i=0;i<n;i++)
		{
			String name=sc.next();
			
			int run=sc.nextInt();
			m.put(name,run);
			
			total+=run;	
		}
		
		System.out.println("Players who batted ");
		for (Map.Entry<String, Integer> map1 : m.entrySet()) {
			System.out.println(map1.getKey() );
		}
		
		System.out.println("Scores by players ");
		for (Map.Entry<String, Integer> map: m.entrySet()) {
			System.out.print(map.getKey() + " : ");
			System.out.println(map.getValue());
			if(maxRun < map.getValue())
				maxRun = map.getValue();
			
		}
		String str = null;
		for (Map.Entry<String, Integer> map : m.entrySet()) { 
			if (maxRun.equals(map.getValue()))
				str = map.getKey();
		}
		 
		System.out.println("Total Score : " + total);
		System.out.println("Name of Highest Scorer : " + str);
		System.out.println("Runs Scored by Dhoni : " + m.get("Dhoni"));
	}
	}
		