package com.varun.dynamicprog;

import java.util.HashMap;
import java.util.Map;

public class CanConstructString {
	public static boolean canConstructWithoutDp(String target, String[] arr){
		if(target.equals("")){
			return true;
		}
		
		for (String string : arr) {
			if(target.startsWith(string)){
				String remainder = target.replaceFirst(string, "");
				if(canConstructWithoutDp(remainder, arr)){
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static boolean canConstructWithDp(String target, String[] arr, Map<String, Boolean> memo){
		if(target.equals("")){
			return true;
		}
		if(memo.containsKey(target)){
			return memo.get(target);
		}
		for (String string : arr) {
			if(target.startsWith(string)){
				String remainder = target.replaceFirst(string, "");
				if(canConstructWithDp(remainder, arr, memo)){
					memo.put(target, true);
					return true;
				}
			}
		}
		memo.put(target, false);
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(canConstructWithoutDp("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
		System.out.println(canConstructWithoutDp("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
		System.out.println(canConstructWithoutDp("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));
		//System.out.println(canConstructWithoutDp("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e", "ee", "eee", "eeeee", "eeeeeeeeeeeeeee"}));
		
		
		System.out.println(canConstructWithDp("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}, new HashMap<String, Boolean>()));
		System.out.println(canConstructWithDp("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}, new HashMap<String, Boolean>()));
		System.out.println(canConstructWithDp("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}, new HashMap<String, Boolean>()));
		System.out.println(canConstructWithDp("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e", "ee", "eee", "eeeee", "eeeeeeeeeeeeeee"}, new HashMap<String, Boolean>()));
	}
}
