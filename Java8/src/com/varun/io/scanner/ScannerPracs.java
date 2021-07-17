package com.varun.io.scanner;

import java.io.File;
import java.util.Scanner;

public class ScannerPracs {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(new File("/home/varun/testfiles/pipedelimtedfile.txt")).useDelimiter(",")){
			System.out.println("Reading file");
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
