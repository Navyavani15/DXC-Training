package assignment5;

abstract class cricket extends Object{
	private int maxOvers;
	private int currentOver;
	private int targetScore;
	private int currentScore;
	public cricket(int maxOvers,int targetScore)
	{
		this.maxOvers=maxOvers;
		this.targetScore=targetScore;
	}
	abstract double calcCurrentRunrate(int currentScore,double currentOver);
	abstract double calcReqdRunrate(int remainingRuns,double remainingOver);
	
	public int getMaxOvers() {
		return maxOvers;
	}
	
	public int getCurrentOver() {
		return currentOver;
	}
	
	public void setCurrentOver(int currentOver) {
		this.currentOver=currentOver;
	}
	public int getTargetScore() {
		return targetScore;
	}
	
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
		

} 
