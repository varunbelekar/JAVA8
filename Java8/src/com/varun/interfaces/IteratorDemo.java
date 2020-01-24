package com.varun.interfaces;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Stock {
    int day;
    int price;
    public Stock(int day, int price) {
        super();
        this.day = day;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Stock [day=" + day + ", price=" + price + "]";
    }
    
    
}

public class IteratorDemo {

	 static int hackerlandRadioTransmitters(int[] x, int k) {
		
		 return 0;
	 }

    public static void main(String[] args) {
       int[] x = {9,5,4,2,6,15,12};
       //int[] x = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
       //int[] x = {1, 10};
        System.out.println(hackerlandRadioTransmitters(x, 2));
    }
}
