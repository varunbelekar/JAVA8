package com.varun.exceptions.trywithresources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResourcesDemo {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new File("/home/varun/sample.txt"));
				PrintWriter writer = new PrintWriter(new File("/home/varun/output.txt"))){
			int count = 0;
			while (sc.hasNext()) {
				System.out.println(++count);
				//System.out.println(sc.next());
				writer.print(sc.nextLine());
				writer.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
