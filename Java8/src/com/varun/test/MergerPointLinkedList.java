package com.varun.test;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	
	@Override
	public String toString() {
		return String.format("%d -> %s", data, next);
	}
}

public class MergerPointLinkedList {
	
	public static Node createLinkedList(){
		Scanner sc = new Scanner(System.in);
		int n = 5;//No of elements
		Node root = null,p = null,q = null;
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			q = new Node();
			q.data = value;
			q.next = null;
			
			if(root == null){
				root = q;
				p = q;
			}
			else{
				p.next = q;
				p = q;
			}
		}
		
		p = root;
		return p;
	}

	public static void main(String[] args) {
		
		Node p = createLinkedList();
		System.out.println(p);
		
	}
}
