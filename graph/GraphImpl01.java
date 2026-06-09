package one;

import java.util.ArrayList;

class GraphImpl01 {
    // Build Graph using Adjancey Matrix Representation
    public static void main(String[] args) {
        // Step - 1 Declare number of numbers and Adajency List for Graph
        int V = 5; // number of nodes (vertex in graph)
        // Create a list of lists: graph.get(i) gives neighbors of node i

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Step - 2
        for (int i = 0; i <= V; i++) {
            // Note: 0 index unused for 1-based nodes

            graph.add(new ArrayList<>());
        }
        // Adding Edges - Undirected Graph Example
        graph.get(1).add(2);
        graph.get(1).add(4);
        graph.get(2).add(1);
        graph.get(2).add(3);
        graph.get(3).add(2);
        graph.get(3).add(4);
        graph.get(4).add(1);
        graph.get(4).add(3);

        // now time to print adjacency list
        for (int i = 1; i < V; i++) {
            System.out.print(i + "--> [ ");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + " , ");
            }
            System.out.println("]");
        }

    }
}