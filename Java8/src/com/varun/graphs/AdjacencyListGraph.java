package com.varun.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class AdjacencyListGraph implements Graph{
	
	private Map<Integer, TreeSet<Integer>> adjacencyList;
	
	public AdjacencyListGraph(){
		this.adjacencyList = new HashMap<Integer, TreeSet<Integer>>();
	}

	@Override
	public void printGraph() {
		adjacencyList.forEach((key, values) ->{
			System.out.println(key + " " + values);
		});
	}

	@Override
	public boolean areTwoNodesConnected(int node1, int node2) {
		return adjacencyList.getOrDefault(node1, new TreeSet<>()).contains(node2);
	}

	@Override
	public List<Integer> getAdjacentNodes(int node) {
		if(adjacencyList.containsKey(node)){
			return new ArrayList<>(adjacencyList.get(node));
		}
		return null;
	}
	
	@Override
	public Graph addEdge(int node1, int node2){
		if(adjacencyList.containsKey(node1)){
			TreeSet<Integer> edgeList = adjacencyList.get(node1);
			edgeList.add(node2);
			adjacencyList.put(node1, edgeList);
		}else{
			TreeSet<Integer> edgeList = new TreeSet<>();
			edgeList.add(node2);
			adjacencyList.put(node1, edgeList);
		}
		return this;
	}
	
}
