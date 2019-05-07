package com.varun.locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle bundle=ResourceBundle.getBundle("message", Locale.ENGLISH);
		System.out.println("English message "+bundle.getString("greeting"));
		
		bundle=ResourceBundle.getBundle("message",Locale.FRENCH);
		System.out.println("French message "+bundle.getString("greeting"));
	}

}
