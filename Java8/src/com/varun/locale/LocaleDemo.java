package com.varun.locale;

import java.util.Locale;

public class LocaleDemo {
	
	public static void localeDemoMethod(){
		Locale locale=Locale.getDefault();
		Locale fr=new Locale("fr","FR");
		System.out.println(locale.getCountry());
		System.out.println(fr.getDisplayCountry());
		System.out.println(fr.getLanguage());
	}
	
	public static void printEnglishInDiffLang(){
		Locale en=new Locale("en","EN");
		Locale fr=new Locale("fr","FR");
		System.out.println(en.getDisplayLanguage());
		System.out.println(en.getDisplayLanguage(fr));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		localeDemoMethod();
		printEnglishInDiffLang();
	}

}
