package com.varun.javacore;


/**
 * @author vbele
 * This class is used to demonstrate the use of nested classes in java.
 */
public class NestedClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass obj=new OuterClass();
		System.out.println(obj.x);
		
		OuterClass.InnerClass obj1= obj.new InnerClass();
		System.out.println("Inner class member y:"+obj1.z);
		System.out.println();
		System.out.println("Static Inner class member w:"+OuterClass.StaticInnerClass.w);
	}

}


class OuterClass{
	int x=5;
	int y=6;
	class InnerClass{
		int z=7;
	}
	static class StaticInnerClass{
		static int w=8;
		public void eat(){
			
		}
	}
}