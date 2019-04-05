package com.varun.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

//Complete the code
public class Test {

	public static void main(String[] args) throws Exception {
//		DoNotTerminate.forbidExit();	

		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine().trim());
			Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
			Inner i=new Inner();
			o = i.new Private();
//			Class<?> pType = Inner.class.getDeclaredClasses()[0];
			Method powerof2 = o.getClass().getDeclaredMethods()[0];
			powerof2.setAccessible(true);
			System.out.println(powerof2.invoke(o, num));
//			obj.powerof2(num);
		//System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
		
		}//end of try

//		catch (DoNotTerminate.ExitTrappedException e) {
		catch (Exception e) {
			System.out.println("Unsuccessful Termination!!");
			e.printStackTrace();
		}
	}//end of main
	static class Inner{
		private class Private{
			private String powerof2(int num){
				return ((num&num-1)==0)?"power of 2":"not a power of 2";
			}
		}
	}//end of Inner
	
}//end of Solution

//class DoNotTerminate { //This class prevents exit(0)
//	 
//    public static class ExitTrappedException extends SecurityException {
//
//		private static final long serialVersionUID = 1L;
//    }
// 
//    public static void forbidExit() {
//        final SecurityManager securityManager = new SecurityManager() {
//            @Override
//            public void checkPermission(Permission permission) {
//                if (permission.getName().contains("exitVM")) {
//                    throw new ExitTrappedException();
//                }
//            }
//        };
//        System.setSecurityManager(securityManager);
//    }
//}	




