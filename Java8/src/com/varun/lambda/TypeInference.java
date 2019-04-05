package com.varun.lambda;

public class TypeInference {
	
	public static  void calcLen(StringLengthLamda s,String name){
		System.out.println(s.strLen(name));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="varun";
		StringLengthLamda s = n->n.length();//Shortest Form of lambda expression.
		System.out.println(s.strLen(name));
		name="aru";
		
		calcLen(n->n.length(),name);
	}

}

interface StringLengthLamda{
	public int strLen(String name);
}
