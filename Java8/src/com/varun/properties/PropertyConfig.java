package com.varun.properties;

public class PropertyConfig {
	public static void main(String[] args) {
		String filePath = System.getProperty("db.file.path") + "/db.properties";
		System.out.println(filePath);
	}
}
