package com.varu.strings;

public class StringDemo {
	
	public static void creatingStrings(){
		String s = "varun";
		String s1 = new String("varun");
		String s2 = "varun";
		System.out.println(s.equals(s1));//Checks content
		System.out.println(s == s1);
		System.out.println(s == s2);
	}
	
	public static void immutableString(){
		String s = "varun";
		s = "belekar";
		System.out.println(s);
		s = s.concat("varun");
		System.out.println(s);
	}
	
	public static void stringCompare(){
		String s1 = "varun";
		String s2 = "aru";
		String s3 = new String("varun");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s2.compareTo(s1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = {'v','a','r','u','n'};
		String s = new String(ch);
		/*System.out.println("String "+s);
		creatingStrings();*/
		
		//immutableString();
		
		stringCompare();
	}

}
