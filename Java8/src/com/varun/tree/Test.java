package com.varun.tree;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

class Node{
	long value;
	Node left;
	Node right;
	
	public Node(long value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	
}
public class Test {
	public static Node insertNode(Node root, long data){
		if(root == null){
			root  = new Node(data);
			return root;
		}
		else if(data < root.value){
			root.left = insertNode(root.left, data);
		}
		else{
			root.right = insertNode(root.right, data);
		}
		return root;
	}
	
	public static void traversal(Node root){
		if(root != null){
			traversal(root.left);
			System.out.println(root.value);
			traversal(root.right);
		}
	}
	
	public static void main(String[] args) {
		long[] arr = {10, 5, 4, 6, 12, 14};
		Scanner sc = new Scanner(System.in);
		Node root = null;
		Random random = new Random();
		/*for (int i = 0; i < 100; i++) {
			long l = random.nextInt(200);
			root = insertNode(root, l);
		}*/
		for (int i = 0; i < arr.length; i++) {
			root = insertNode(root, arr[i]);
		}
		Node parent = root;
		//traversal(root);
		String ch = "";
		int iteration  = 1;
		Stack<Node> stack = new Stack();
		System.out.println("Iteration 0 value " + root.value);
		do{
			ch = sc.nextLine();
			if("l".equals(ch)){
				System.out.println("Iteration " + iteration++ + " value " + root.left.value);
				if(!stack.contains(root))
					stack.add(root);
				root = root.left;
			}else if("r".equals(ch)){
				System.out.println("Iteration " + iteration++ + " value " + root.right.value);
				if(!stack.contains(root))
					stack.add(root);
				root = root.right;
			}else if("p".equals(ch)){
				System.out.println("Iteration " + iteration++ + " value " + stack.peek().value);
				root = stack.peek();
				stack.pop();
			}
		}while(!ch.equals("n"));
	}
}
