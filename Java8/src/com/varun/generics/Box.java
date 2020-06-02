package com.varun.generics;

public class Box<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public Box(T t) {
		super();
		this.t = t;
	}
	
	
}
