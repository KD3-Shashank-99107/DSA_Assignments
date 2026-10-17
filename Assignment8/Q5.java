package Assignment8;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q5 {

}


class GraphTraversal {

    private int vertices;
    private List<List<Integer>> adj;

    public GraphTraversal(int vertices) {
        this.vertices = vertices;
        adj = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Add an undirected edge
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // Breadth First Search
    public void bfs(int start) {
        boolean[] visited = new boolean[vertices];

        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        System.out.print("BFS: ");

        while (!q.isEmpty()) {
            int node = q.remove();

            System.out.print(node + " ");

            for (int neighbour : adj.get(node)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }

        System.out.println();
    }

    // Depth First Search
    private void dfsHelper(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbour : adj.get(node)) {
            if (!visited[neighbour]) {
                dfsHelper(neighbour, visited);
            }
        }
    }

    public void dfs(int start) {
        boolean[] visited = new boolean[vertices];

        System.out.print("DFS: ");
        dfsHelper(start, visited);
        System.out.println();
    }

    public static void main(String[] args) {
        GraphTraversal graph = new GraphTraversal(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(4, 5);

        graph.bfs(0);
        graph.dfs(0);
    }
}