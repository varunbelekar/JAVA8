package com.varun.test;

import java.util.StringJoiner;

public class Rectangle {
	int w;
	int h;
	public Rectangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}
	
	public int area(){
		return this.w * this.h;
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(5, 4);
		System.out.println(r.area());
		Rectangle r1 = new Rectangle(5, 5);
		System.out.println(r1.area());
		
		Square s1 = new Square(5);
		System.out.println(s1.area());
		
	}
	
}

class Square extends Rectangle{
	public Square(int s) {
		super(s, s);
	}
}
