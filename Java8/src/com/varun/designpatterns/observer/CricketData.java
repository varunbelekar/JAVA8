package com.varun.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class CricketData implements Subject{
	private int runs;
	private int wickets;
	private float overs;
	private List<Observer> observers;
	
	public CricketData(){
		observers = new ArrayList<>();
	}

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

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}
	
	public int getLatestRuns(){
		return 90;//for simplicity
	}
	
	public int getLatestWickets(){
		return 2;//for simplicity
	}
	
	public float getLatestOvers(){
		return (float)12.2;//for simplicity
	}
	
	public void dataChanged(){
		runs = getLatestRuns();
		wickets = getLatestWickets();
		overs = getLatestWickets();
		
		notifyObserver();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unregisterObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(runs, wickets, overs);
		}
	}
	
}
