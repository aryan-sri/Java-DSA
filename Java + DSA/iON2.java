
    import java.util.*;

public class iON2 {
    public static int[] visibleProfiles(int connection_nodes, int connection_edges, int[] connection_from, int[] connection_to, int[] queries) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= connection_nodes; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < connection_edges; i++) {
            int from = connection_from[i];
            int to = connection_to[i];
            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            boolean[] visited = new boolean[connection_nodes + 1];
            result[i] = dfs(queries[i], graph, visited);
        }

        return result;
    }

    public static int dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        if (visited[node]) {
            return 0;
        }

        visited[node] = true;
        int count = 1;
        for (int neighbor : graph.get(node)) {
            count += dfs(neighbor, graph, visited);
        }

        return count;
    }

    public static void main(String[] args) {
        int connection_nodes = 7;
        int connection_edges = 4;
        int[] connection_from = {1, 2, 3, 5};
        int[] connection_to = {2, 3, 4, 6};
        int[] queries = {1, 3, 5, 7};

        int[] result = visibleProfiles(connection_nodes, connection_edges, connection_from, connection_to, queries);

        System.out.println("Number of visible profiles for each query: " + Arrays.toString(result));
    }
}


