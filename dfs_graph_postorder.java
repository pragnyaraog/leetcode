import java.util.*;

public class dfs_graph_postorder {

    static void add(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static ArrayList<Integer> dfsPostorder(ArrayList<ArrayList<Integer>> adj, int start) {

        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        Stack<Integer> stack = new Stack<>();

        stack.push(start);
        stack.push(start); // push twice

        while (!stack.isEmpty()) {

            int curr = stack.pop();

            if (!stack.isEmpty() && stack.peek() == curr) {

                if (!visited[curr]) {

                    visited[curr] = true;

                    for (int i = adj.get(curr).size() - 1; i >= 0; i--) {
                        int neighbor = adj.get(curr).get(i);

                        if (!visited[neighbor]) {
                            stack.push(neighbor);
                            stack.push(neighbor);
                        }
                    }
                }

            } else {
                result.add(curr); // POSTORDER → after children
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int v = 7;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<>());
        }

        add(graph, 1, 2);
        add(graph, 1, 4);
        add(graph, 1, 5);
        add(graph, 2, 3);
        add(graph, 3, 4);
        add(graph, 5, 6);
        add(graph, 5, 7);
        add(graph, 6, 7);

        System.out.println(dfsPostorder(graph, 1));
    }
}