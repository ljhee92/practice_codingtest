import java.io.*;
import java.util.*;

public class Main {
    static int n, m, r;
    static boolean[] visited;
    static List<List<Integer>> graph = new ArrayList<>();
    static int[] depth;
    static long[] order;
    static int count = 1;
    
    public static void main(String[] args) throws Exception {
        init();
        
        dfs(r, 0);
        
        long result = 0;
        for (int i = 1; i <= n; i++) {
            if (depth[i] != -1) {
                result += depth[i] * order[i];   
            }
        }
        System.out.println(result);
    }
    
    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        
        visited = new boolean[n+1];
        depth = new int[n+1];
        order = new long[n+1];
        
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
        
        for (int i = 1; i <= n; i++) {
            graph.get(i).sort(Comparator.naturalOrder());
        }
    }
    
    private static void dfs(int currentNode, int currentDepth) {
        visited[currentNode] = true;
        depth[currentNode] = currentDepth;
        order[currentNode] = count++;
                
        for (int value : graph.get(currentNode)) {
            if (!visited[value]) {
                dfs(value, currentDepth+1);
            }
        }
    }
}