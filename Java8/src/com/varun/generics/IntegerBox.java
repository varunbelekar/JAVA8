package com.varun.generics;

public class IntegerBox<T extends Integer> {
	private T integer;

	public T getInteger() {
		return integer;
	}

	public void setT(T t) {
		this.integer = t;
	}

	public IntegerBox(T t) {
		super();
		this.integer = t;
	}
	
	
}
