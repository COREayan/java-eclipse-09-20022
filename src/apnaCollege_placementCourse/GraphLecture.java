package apnaCollege_placementCourse;

import java.util.*;

public class GraphLecture {
	static class Edge {
		int src; 
		int dest; 
		
		public Edge(int s, int d) {
			this.src = s;
			this.dest = d;
		}
	}
	
	public static void createGraph(ArrayList<Edge> graph[]) {
		for (int i=0; i<graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}
		
		/*
		 // for dfs & bfs
		graph[0].add(new Edge(0, 1));
		graph[0].add(new Edge(0, 2));
		
		graph[1].add(new Edge(1, 0));
		graph[1].add(new Edge(1, 3));
		
		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 4));
		
		graph[3].add(new Edge(3, 1));
		graph[3].add(new Edge(3, 4));
		graph[3].add(new Edge(3, 5));
		
		graph[4].add(new Edge(4, 2));
		graph[4].add(new Edge(4, 3));
		graph[4].add(new Edge(4, 5));
		

		graph[5].add(new Edge(5, 3));
		graph[5].add(new Edge(5, 4));
		graph[5].add(new Edge(5, 6));
		

		graph[6].add(new Edge(6, 5));
		*/
		
		/*
		 // for cycle detection 
		graph[0].add(new Edge(0, 2));
		
		graph[1].add(new Edge(1, 0));
		
		graph[2].add(new Edge(2, 3));
		
		graph[3].add(new Edge(3, 0));
		*/ 
		
		/*
		// for Topological sorting 
		graph[2].add(new Edge(2, 3));
		
		graph[3].add(new Edge(3, 1));
		
		graph[4].add(new Edge(4, 0));
		graph[4].add(new Edge(4, 1));
		
		graph[5].add(new Edge(5, 0));
		graph[5].add(new Edge(5, 2));
		*/
		
		
		// for cycle detection in Undirected Graph
		graph[0].add(new Edge(0, 1));
		graph[0].add(new Edge(0, 4));
		
		graph[1].add(new Edge(1, 0));
		graph[1].add(new Edge(1, 2));
		graph[1].add(new Edge(1, 4));
		
		graph[2].add(new Edge(2, 1));
		graph[2].add(new Edge(2, 3));
		
		graph[3].add(new Edge(3, 2));
		
		graph[4].add(new Edge(4, 0));
		graph[4].add(new Edge(4, 1));
		graph[4].add(new Edge(4, 5));
		
		graph[5].add(new Edge(5, 4));
	}
	
	public static void bfs(ArrayList<Edge> graph[], int V, boolean[] vis, int start) {
		Queue<Integer> q = new LinkedList<>();
		
		q.add(start);
		
		while (!q.isEmpty()) {
			int curr = q.remove();
			if (vis[curr] == false) {
				System.out.print(curr + " ");
				vis[curr] = true;
				
				for (int i=0; i<graph[curr].size(); i++) {
					Edge e = graph[curr].get(i);
					q.add(e.dest);
				}
			}
		}
	}
	
	public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
		System.out.print(curr + " ");
		vis[curr] = true;
		
		for (int i=0; i<graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if (vis[e.dest] == false) {
				dfs(graph, e.dest, vis);
			}
		}
	}
	
	public static void printAllPath(ArrayList<Edge> graph[], boolean vis[], int curr, String path, int tar) {
		if (curr == tar) {
			System.out.println(path);
			return;
		}
		
		for (int i=0; i<graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if (!vis[e.dest]) {
				vis[curr] = true;
				printAllPath(graph, vis, e.dest, path+e.dest, tar);
				vis[curr] = false;
			}
		}
	}
	
	public static boolean isCycleDirected(ArrayList<Edge> graph[], boolean vis[], int curr, boolean rec[]) {
		vis[curr] = true;
		rec[curr] = true;
		
		for (int i=0; i<graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if (rec[e.dest]) { // cycle
				return true;
			} else if (!vis[e.dest]) {
				if (isCycleDirected(graph, vis, e.dest, rec)) {
					return true;
				}
			}
		}
		
		rec[curr] = false;
		return false;
	}
	
	public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> stack) {
		vis[curr] = true;
		
		for (int i=0; i<graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			
			if (!vis[e.dest]) {
				topSortUtil(graph, e.dest, vis, stack);
			}
		}
		
		stack.push(curr);
	}
	
	public static void topSort(ArrayList<Edge> graph[], int V) {
		boolean vis[] = new boolean[V];
		Stack<Integer> stack = new Stack<>();
		
		for (int i=0; i<V; i++) {
			if (!vis[i]) {
				topSortUtil(graph, i, vis, stack);
			}
		}
		
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
	
	public static boolean isCycleUndirected(ArrayList<Edge> graph[], boolean vis[], int curr, int par) {
		vis[curr] = true;
		
		for (int i=0; i<graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if (vis[e.dest] && e.dest != par) {
				return true;
			} else if (!vis[e.dest]) {
				if (isCycleUndirected(graph, vis, e.dest, curr)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int V = 6;
		ArrayList<Edge> graph[] = new ArrayList[V];
		createGraph(graph);
		
		/*
		// print 2's neighbours 
		for (int i=0; i<graph[2].size(); i++) {
			Edge e = graph[2].get(i);
			System.out.print(e.dest + " ");
		}*/
		
		/*
		System.out.println("\n\nBFS");
		boolean vis[] = new boolean[V];
		for (int i=0; i<V; i++) {
			if (vis[i] == false) {
				bfs(graph, V, vis, i);
			}
		}*/
		
		/*
		System.out.println("\n\nDFS");
		boolean vis[] = new boolean[V];
		for (int i=0; i<V; i++) {
			if (vis[i] == false) {
				dfs(graph, 0, vis);	
			}
		}*/
		
		/*
		// All Paths Qs
		int src = 0, tar = 5;
		printAllPath(graph, new boolean[V], src, "0", tar);
		*/
		
		/*
		// Cycle Detection
		boolean vis[] = new boolean[V];
		boolean rec[] = new boolean[V];
		for (int i=0; i<V; i++) {
			if (!vis[i]) {
				boolean isCycle = isCycleDirected(graph, vis, 0, rec);
				if (isCycle) {
					System.out.println(isCycle);
					break;
				}
			}
		}
//		System.out.println(isCycleDirected(graph, new boolean[V], 0, new boolean[V]));
		*/
		
		/*
		// Topological Sorting
		topSort(graph, V);
		*/
		
		// Cycle detection undirected 
		System.out.println(isCycleUndirected(graph, new boolean[V], 0, -1));
		
		System.out.println();
	}
}
