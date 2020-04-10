package com.varun.dzone.java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalJava8 {
	public static String pickLuckyName(List<String> names, String startingLetter){
		Optional<String> luckyName =  names.stream()
			 .filter(p -> p.startsWith(startingLetter))
			 .findFirst();
		return luckyName.orElse("No Lucky Name");
	}
	
	
	public static void main(String[] args) {
		List<String> NAMES = Arrays.asList("Rita", "Gita", "Nita", "Ritesh", "Nitesh", "Ganesh", "Yogen", "Prateema");
		System.out.println(pickLuckyName(NAMES, "V"));
	}
}
