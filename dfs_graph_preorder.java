import java.util.*;

public class dfs_graph_preorder {

    static void add(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static ArrayList<Integer> dfsPreorder(ArrayList<ArrayList<Integer>> adj, int start) {

        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {

            int curr = stack.pop();

            if (!visited[curr]) {

                visited[curr] = true;
                result.add(curr); // PREORDER → visit first

                for (int i = adj.get(curr).size() - 1; i >= 0; i--) {
                    int neighbor = adj.get(curr).get(i);

                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
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

        System.out.println(dfsPreorder(graph, 1));
    }
}