package com.varun.interfaces;

public class Demo {
	
	 public static void greeting(Greeting g){
		g.greet();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo.greeting(new HolidayGreeeting());	
		Greeting lambdaexp = () ->{
			System.out.println("Hello");			
		};
		
		Add addLambda=(int a,int b)->a+b;
		System.out.println(addLambda.add(5, 12));
		
	}

}

interface Add{
	public int add(int x , int y);
	default double add1(int x, int y){
		return x+y;
	}
}