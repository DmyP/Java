package graph;

import java.util.*;

public class DFS {

    public static Stack<Integer> DFS(CapGraph graph, Stack<Integer> vertices) {
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> finished = new Stack<>();

        while (!vertices.isEmpty()) {
            Integer vertex = vertices.pop();
            if (!visited.contains(vertex))
                DFS_VISIT(graph, vertex, visited, finished);
        }
        return finished;
    }

    public static void DFS_VISIT(CapGraph graph, Integer vertex, HashSet<Integer> visited, Stack<Integer> finished) {
        visited.add(vertex);
        for (Integer n : graph.getMap().get(vertex))
            if (!visited.contains(n))
                DFS_VISIT(graph, n, visited, finished);
        finished.push(vertex);
    }

    public static List<Graph> SCC(CapGraph graph, Stack<Integer> vertices) {
        List<Graph> sccList = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> finished = new Stack<>();

        while (!vertices.isEmpty()) {
            Integer vertex = vertices.pop();
            if (!visited.contains(vertex)) {
                DFS_VISIT(graph, vertex, visited, finished);

                Graph scc = new CapGraph();
                for (Integer n : finished)
                    scc.addVertex(n);
                for (Integer n : finished)
                    for (Integer v : graph.getMap().get(n))
                        if (finished.contains(v))
                            scc.addEdge(v, n);
                sccList.add(scc);
                finished = new Stack<>();
            }
        }
        return sccList;
    }
}