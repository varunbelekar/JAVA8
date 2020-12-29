package com.varun.dynamicprog;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AllConstructString {
	public static List<List<String>> allConstructStringWithoutDP(String target, String[] words){
		if(target.equals("")){
			return new LinkedList<>();
		}
		List<List<String>> result = new LinkedList<>();
		for (String word : words) {
			if(target.startsWith(word)){
				String suffix = target.replaceFirst(word, "");
				List<List<String>> suffixWays = allConstructStringWithoutDP(suffix, words);
				List<List<String>> targetWays = new LinkedList<>(suffixWays);
				if(targetWays.isEmpty()){
					targetWays.add(new LinkedList<>(Arrays.asList(word)));
				}else{
					targetWays.forEach(way -> way.add(0, word));
				}
				List<String> branchResult = targetWays.stream()
													  .flatMap(element -> element.stream())
													  .collect(Collectors.toList());
				result.add(branchResult);
			}
		}
		return result;
	}
	
	public static void creating2DLinkedList(){
		List<List<String>> list = new LinkedList<>();
		list.add(new LinkedList<>(Arrays.asList("pot", "head")));
		list.add(new LinkedList<>(Arrays.asList("varun", "bel")));
		System.out.println("Original list: \n" + list);
		list.forEach(individualList -> individualList.add(0, "vini"));
		System.out.println("After adding: \n" + list);
	}
	
	public static void main(String[] args) {
		System.out.println(allConstructStringWithoutDP("pot", new String[]{"pot"}));
		System.out.println(allConstructStringWithoutDP("purple", new String[]{"purp", "p", "ur", "le", "purpl"}));
		
		
	}
}
