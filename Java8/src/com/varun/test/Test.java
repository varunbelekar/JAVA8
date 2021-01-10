package com.varun.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Stream;


// 1 2 3 4 5
// 1 4 3 2 5

 class ListNode {
	     int val;
	     ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

public class Test {
	public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        for (int i = 0; i < arr.length - 1; i++) {
			int j = 0;
			int next = arr[i] ^ j;
			while(next != encoded[i]) {
				next = arr[i] ^ ++j;
			}
			arr[i + 1] = j;
		}
        return arr;
    }
	
	public ListNode swapNodes(ListNode head, int k) {// 1 2, k = 2
		ListNode temp = head;
		int size = 0;
		while(temp != null) {
			temp = temp.next;
			size++;
		}
		if(size == 1){
            return head;
        }
		temp = head;
        ListNode[] arr = new ListNode[size];
        for (int i = 0; i < arr.length; i++) {
			arr[i] = temp;
			temp = temp.next;
		}
        temp = arr[k - 1];
        arr[k - 1] = arr[size - k];
        arr[size - k] = temp;
        
        if(k - 2 >= 0) {
        	arr[k - 2].next = arr[k - 1];
        }
        
        if(k < size) {
        	arr[k - 1].next = arr[k];
        }
        
        arr[size - k - 1].next = arr[size - k];
        
        if(size - k + 1 < size) {
        	arr[size - k].next = arr[size - k + 1];
        }
        arr[size - 1].next = null;
        
        return arr[0];
    }
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
	}
}
