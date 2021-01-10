package com.varun.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class AdjacencyListGraph implements Graph{
	
	private Map<Integer, HashSet<Integer>> adjacencyList;
	
	public AdjacencyListGraph(){
		this.adjacencyList = new HashMap<Integer, HashSet<Integer>>();
	}

	@Override
	public void printGraph() {
		adjacencyList.forEach((key, values) ->{
			System.out.println(key + " " + values);
		});
	}

	@Override
	public boolean areTwoNodesConnected(int node1, int node2) {
		return adjacencyList.getOrDefault(node1, new HashSet<>()).contains(node2);
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
			HashSet<Integer> edgeList = adjacencyList.get(node1);
			edgeList.add(node2);
			adjacencyList.put(node1, edgeList);
		}else{
			HashSet<Integer> edgeList = new HashSet<>();
			edgeList.add(node2);
			adjacencyList.put(node1, edgeList);
		}
		return this;
	}

	@Override
	public void dfs(int startNode, boolean[] visited) {
		// TODO Auto-generated method stub
		
	}
}
