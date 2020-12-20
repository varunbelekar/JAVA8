package com.varun.date;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.reformatNumber("--17-5 229 35-39475 "));
	}
	
	public String reformatNumber(String number) {
		StringBuilder originalNum = new StringBuilder(number.replaceAll("[\s-]", ""));
		StringBuilder formattedNumber = new StringBuilder("");
		
		while(number.length() > 0) {
			if(number.length() > 4) {
				formattedNumber.append(number.substring(0, 3))
							   .append("-");
				originalNum = new StringBuilder(originalNum.substring(3));
			}else {
				if(number.length() == 4) {
					formattedNumber.append(number.substring(0, 2))
								   .append("-")
								   .append(number.substring(2, number.length()));
					return formattedNumber.toString();
				}else if(number.length() == 3 || number.length() == 2) {
					formattedNumber.append(number.substring(0));
					return formattedNumber.toString();
				}
			}
		}
		return formattedNumber.toString();
    }
	
	public int maximumUniqueSubarray(int[] nums) {
		if(nums.length == 1){
            return nums[0];
        }
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<>();
		int maxSum = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], i);
				maxSum += nums[i];
				
			}else {
				map.remove(nums[i]);
			}
			/*for (int j = i + 1; j < nums.length; j++) {
				if(! map.containsKey(nums[j])) {
					map.put(nums[j], j);
					maxSum += nums[j];
				}else {
					map.clear();
					list.add(maxSum);
					break;
				}
			}*/
		}
		Collections.sort(list);
		return list.get(list.size() - 1);
    }
}
