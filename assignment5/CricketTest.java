package assignment5;

import java.util.Scanner;

public class CricketTest {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter target runs");
		int targetRuns=sc.nextInt();
		
		System.out.println("Enter current over");
		int currentOver=sc.nextInt();
		
		System.out.println("Enter current score");
		int currentScore=sc.nextInt();
		
		OneDayCricket obc = new OneDayCricket(targetRuns);
		obc.setCurrentOver(currentOver);
		obc.setCurrentScore(currentScore);
		sc.close();
		System.out.println("Current run rate : ");
		System.out.println(obc.calcCurrentRunrate(currentScore, currentOver));
		System.out.println("Required run rate : ");
		System.out.println(obc.calcReqdRunrate((targetRuns-currentScore), (obc.getMaxOvers()-currentOver)));
	}
		
}
