package com.varun.designpatterns.observer;

public class AverageScoreDisplay implements Observer{
	private static final float TOTAL_OVERS = 50;
	private int predictedScore;
	private float runRate;
	
	public int getPredictedScore() {
		return predictedScore;
	}
	public void setPredictedScore(int predictedScore) {
		this.predictedScore = predictedScore;
	}
	public float getRunRate() {
		return runRate;
	}
	public void setRunRate(float runRate) {
		this.runRate = runRate;
	}
	
	public void display(){
		System.out.println("Predicted Score : " + predictedScore + "\t RunRate : " + runRate);
	}
	
	@Override
	public void update(int runs, int wickets, float overs) {
		runRate = runs / overs;
		predictedScore = (int)(runRate * (TOTAL_OVERS - overs));
		display();
	}
	
}
