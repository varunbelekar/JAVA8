package com.varun.designpatterns.observer;

public class CurrentScoreDisplay implements Observer{
	private int runs;
	private int wickets;
	private float overs;
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public float getOvers() {
		return overs;
	}
	public void setOvers(float overs) {
		this.overs = overs;
	}
	
	public void display(){
		System.out.println("Runs: " + runs + "\tWicksets : " + wickets + "\tOvers : " + overs);
	}
	@Override
	public void update(int runs, int wickets, float overs) {
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
		display();
	}
}
