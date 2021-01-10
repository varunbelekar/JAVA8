package com.varun.graphs;

import java.util.Scanner;

public class GraphTest {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("******Using adjecency matrix********");
		System.out.println("Enter the number of vertices");
		Graph adjacencyMatrixGraph = new AdjacencyMatrixGraph(sc.nextInt());
		graphMethodTests(adjacencyMatrixGraph);
		System.out.println("******End**********");
		
		
		System.out.println("*******Using Adjacency List*********");
		Graph adjacencyListGraph = new AdjacencyListGraph();
		graphMethodTests(adjacencyListGraph);
		System.out.println("*******End*********");
	}
	
	

	private static void graphMethodTests(Graph graph) {
		createGraph(graph);
		
		
		graph.printGraph();
		
		//Check two nodes connected
		System.out.println(graph.areTwoNodesConnected(0, 3));
		System.out.println(graph.areTwoNodesConnected(0, 2));
		
		//Get Adjacent nodes
		System.out.println(graph.getAdjacentNodes(0));
		System.out.println(graph.getAdjacentNodes(3));
		
		//Perform dfs search
		System.out.println("Dfs search:");
		graph.dfs(1, new boolean[4]);
		
		//Depth of graph from start node
		System.out.println("Depth of graph: " + graph.depthOfGraph(0, new boolean[4]));
	}

	private static void createGraph(Graph graph) {
		graph.addEdge(0, 1)
			 .addEdge(0, 3)
			 .addEdge(1, 0)
			 .addEdge(1, 2)
			 .addEdge(1, 3)
			 .addEdge(2, 1)
			 .addEdge(3, 0)
			 .addEdge(2, 3)
			 .addEdge(3, 1)
			 .addEdge(3, 2);
	}
}
