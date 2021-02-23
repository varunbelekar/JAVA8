package com.varun.designpatterns.observer;

public class Driver {
	public static void main(String[] args) {
		CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();
		AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
		
		CricketData cricketData = new CricketData();
		cricketData.registerObserver(currentScoreDisplay);
		cricketData.registerObserver(averageScoreDisplay);
		
		cricketData.dataChanged();
		
		cricketData.unregisterObserver(averageScoreDisplay);
		cricketData.dataChanged();
	}
}
