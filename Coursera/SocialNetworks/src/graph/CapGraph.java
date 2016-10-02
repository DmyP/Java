package graph;

import java.util.*;

/**
 * @author Dmytro.
 *
 * For the warm up assignment, you must implement your Graph in a class
 * named CapGraph.  Here is the stub file.
 *
 */
public class CapGraph implements Graph {
	private HashMap<Integer, LinkedList<Integer>> mapAdjList;
	public CapGraph() {
		mapAdjList = new HashMap<>();
	}

	public HashMap<Integer, LinkedList<Integer>> getMap() {
		return mapAdjList;
	}

	/* (non-Javadoc)
	 * @see graph.Graph#addVertex(int)
	 */
	@Override
	public void addVertex(int num) {
		if (mapAdjList.containsKey(num)) return;
			mapAdjList.put(num, new LinkedList<>());
	}

	public Stack<Integer> getVertices() {
		Stack<Integer> vertices = new Stack<>();
		vertices.addAll(mapAdjList.keySet());
		return vertices;
	}

	/* (non-Javadoc)
	 * @see graph.Graph#addEdge(int, int)
	 */
	@Override
	public void addEdge(int from, int to) {
		if (!mapAdjList.containsKey(from) || !mapAdjList.containsKey(to)) return;
			mapAdjList.get(from).add(to);
	}

	/* (non-Javadoc)
	 * @see graph.Graph#getEgonet(int)
	 */
	@Override
	public Graph getEgonet(int root) {
		CapGraph graph = new CapGraph();
		if (!mapAdjList.containsKey(root))
			return graph;
		graph.addVertex(root);
		LinkedList<Integer> neighbors = mapAdjList.get(root);
		if (neighbors == null) return graph;

		for (Integer vertex : neighbors) {
			graph.addVertex(vertex);
			graph.addEdge(root, vertex);
		}

		for (Integer vertex : neighbors) {
			LinkedList<Integer> set = mapAdjList.get(vertex);
			for (Integer node : set) {
				if (neighbors.contains(node) || node == root) graph.addEdge(vertex, node);
			}
		}
		return graph;
	}

	public CapGraph transposer() {
		CapGraph graph = new CapGraph();
		mapAdjList.keySet().forEach(graph::addVertex);

		for (Integer vertex : mapAdjList.keySet()) {
			LinkedList<Integer> neighbors = mapAdjList.get(vertex);
			for (Integer neighbor : neighbors) graph.addEdge(neighbor, vertex);
		}
		return graph;
	}

	/* (non-Javadoc)
	 * @see graph.Graph#getSCCs()
	 */
	@Override
	public List<Graph> getSCCs() {
		Stack<Integer> vertices = getVertices();
		Stack<Integer> finished = DFS.DFS(this, vertices);
		return DFS.SCC(this.transposer(), finished);
	}

	/* (non-Javadoc)
	 * @see graph.Graph#exportGraph()
	 */
	@Override
	public HashMap<Integer, HashSet<Integer>> exportGraph() {
		HashMap<Integer, HashSet<Integer>> mapGraph = new HashMap<>();
		for (Integer vertex : mapAdjList.keySet())
		    mapGraph.put(vertex, new HashSet<>());
		for (Integer vertex : mapAdjList.keySet())
			for (Integer neighbor : mapAdjList.get(vertex))
			    mapGraph.get(vertex).add(neighbor);
		return mapGraph;
	}

}