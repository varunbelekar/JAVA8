package com.varun.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
	public static void main(String[] args) {
		String[] strs = {"varun", "anu", "aru"};
		try {
			FileWriter fileWriter = new FileWriter("C:\\Users\\vbele\\OneDrive - Nets Group\\E_Drive_Backup_Varun\\Mepo\\GDPR\\output.txt");
			for (String string : strs) {
				fileWriter.write(string + System.lineSeparator());
			}
			fileWriter.write("******");
			fileWriter.close();
			System.out.println("success");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
