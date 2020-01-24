package com.varun.sreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class Stock {
    int day;
    int price;
   
    public Stock(int day, int price) {
        super();
        this.day = day;
        this.price = price;
    }
    
    
    public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
    public String toString() {
        return "Stock [day=" + day + ", price=" + price + "]";
    }
    
    
}
public class StreamDemo {
	static long buyMaximumProducts(int n, long k, Integer[] a) {
        long noOfStocks = 0;
        List<Stock> list = new ArrayList<Stock>();
        list = IntStream.range(0, a.length)
        		 .mapToObj(i -> new Stock(i, a[i]))
        		 .sorted(Comparator.comparing(Stock::getPrice))
        		 .collect(Collectors.toList())
        		 ;
        for (Stock stock : list) {
            int i = stock.day;
            while(i != 0 && k >= stock.price){
                k = k - stock.price;
                noOfStocks++;
                i--;
                if(k < stock.price){
                    return noOfStocks;
                }
            }
        }
        return noOfStocks;
    }
	public static void main(String[] args) {
		Integer[] a = {10, 7, 19};
		buyMaximumProducts(3, 45, a);
	}

}
