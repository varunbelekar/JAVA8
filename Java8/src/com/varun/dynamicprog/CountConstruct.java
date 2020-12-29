package com.varun.dynamicprog;

import java.util.HashMap;
import java.util.Map;

public class CountConstruct {
	public static int countConstructStringWithoutDP(String target, String[] words){
		if(target.equals("")){
			return 1;
		}
		int count = 0;
		for (String word : words) {
			if(target.startsWith(word)){
				String remainder = target.replaceFirst(word, "");
				count += countConstructStringWithoutDP(remainder, words);
			}
		}
		return count;
	}
	
	public static int countConstructStringWithDP(String target, String[] words, Map<String, Integer> memo){
		if(target.equals("")){
			return 1;
		}
		if(memo.containsKey(target)){
			return memo.get(target);
		}
		int count = 0;
		for (String word : words) {
			if(target.startsWith(word)){
				String remainder = target.replaceFirst(word, "");
				count += countConstructStringWithDP(remainder, words, memo);
			}
		}
		memo.put(target, count);
		return count;
	}
	
	public static int decrementeer(int n){
		if(n == 0){
			return 0;
		}
		int counter = 0;
		if(decrementeer(n - 1) == 0){
			System.out.println("true");
			counter++;
		}
		return counter;
	}
	
	public static void main(String[] args) {
		System.out.println(countConstructStringWithoutDP("purple", new String[]{"purp", "p", "ur", "le", "purpl"}));
		System.out.println(countConstructStringWithoutDP("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
		System.out.println(countConstructStringWithoutDP("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
		System.out.println(countConstructStringWithoutDP("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));
		System.out.println(countConstructStringWithoutDP("pot", new String[]{"p", "o", "t", "ot"}));
		System.out.println(countConstructStringWithoutDP("aab", new String[]{"a", "b", "ab"}));
		//System.out.println(countConstructStringWithoutDP("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e", "ee", "eee", "eeeee", "eeeeeeeeeeeeeee"}));
		
		System.out.println("with dp:");
		System.out.println(countConstructStringWithDP("purple", new String[]{"purp", "p", "ur", "le", "purpl"}, new HashMap<String, Integer>()));
		System.out.println(countConstructStringWithDP("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}, new HashMap<String, Integer>()));
		System.out.println(countConstructStringWithDP("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}, new HashMap<String, Integer>()));
		System.out.println(countConstructStringWithDP("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}, new HashMap<String, Integer>()));
		System.out.println(countConstructStringWithDP("pot", new String[]{"p", "o", "t", "ot"}, new HashMap<String, Integer>()));
		System.out.println(countConstructStringWithDP("aab", new String[]{"a", "b", "ab"}, new HashMap<String, Integer>()));
		System.out.println(countConstructStringWithDP("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{"e", "ee", "eee", "eeeee", "eeeeeeeeeeeeeee"}, new HashMap<String, Integer>()));
		
		//System.out.println(decrementeer(10));
	}
}
