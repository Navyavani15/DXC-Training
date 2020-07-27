package assignment5;

  class OneDayCricket extends cricket {
	
	public OneDayCricket(int targetScore)
	{
		super(50,targetScore);
	}
	double calcCurrentRunrate(int currentScore,int currentOver)
	{
		return currentScore/currentOver;
	}
	double calcReqdRuntrate(int remainingRuns,int remainingOver)
	{
		return remainingRuns/remainingOver;
	}
	
	double calcCurrentRunrate(int currentScore, double currentOver) {
		return currentScore/currentOver;
		
	}

	double calcReqdRunrate(int remainingRuns, double remainingOver) {
		
	return	remainingRuns/remainingOver;
	}

}
