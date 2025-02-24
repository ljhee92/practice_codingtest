import java.io.*;
import java.util.*;

public class Main {
    static int n, m, r;
    static boolean[] visited;
    static List<List<Integer>> graph = new ArrayList<>();
    static int[] depth;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];
        depth = new int[n+1];
        
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
            depth[i] = -1;
        }
        
        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        dfs(r, 0);
        
        for (int i = 1; i <= n; i++) {
            System.out.println(depth[i]);
        }
    }
    
    private static void dfs(int node, int currentDepth) {
        visited[node] = true;
        depth[node] = currentDepth;
        graph.get(node).sort(Collections.reverseOrder());
        
        for (int value : graph.get(node)) {
            if (!visited[value]) {
                dfs(value, currentDepth+1);
            }
        }
    }
}