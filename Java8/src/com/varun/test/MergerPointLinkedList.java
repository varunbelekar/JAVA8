package com.varun.test;

import java.util.ArrayList;
import java.util.List;

class Node {
	int data;
	Node next;

	@Override
	public String toString() {
		return String.format("%d -> %s", data, next);
	}
}

public class MergerPointLinkedList {

	public static void findMergePoint(Node head1, Node head2) {
		Node head1b = head1;
		Node head2b = head2;
		
		while(head1.next != null){
			
			while(head2.next != null){
				
			}
		}
	}

	public static Node createLinkedListFromArray(int[] list) {
		Node root = null, p = null, q = null;
		// Creating List1
		for (int i = 0; i < list.length; i++) {
			q = new Node();
			q.data = list[i];
			q.next = null;

			if (root == null) {
				root = q;
				p = q;
			} else {
				p.next = q;
				p = q;
			}
		}
		return root;
	}

	public static void createLinkedList() {
		int list1[] = {1,2,3}; 
		int list2[] = {1,3 };

		Node root1 = createLinkedListFromArray(list1);
		Node root2 = createLinkedListFromArray(list2);

		System.out.println(root1.toString());
		System.out.println(root2.toString());

		findMergePoint(root1, root2);
	}

	public static void main(String[] args) {
		createLinkedList();
	}
}
