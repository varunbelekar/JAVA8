package com.varu.strings;

public class StringIntroHackerRank {
	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "efg";
		char[] a = (s1 + " "+ s2).toCharArray();
		a[0]  = Character.toUpperCase(a[0]);
		for (char c : a) {
			System.out.print(c);
		}
	}
}
