package com.varun.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(new File("/home/varun/Payslip_December2020_Unlocked.pdf"));
		Scanner sc = new Scanner(fis, "UTF-8");
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
}
