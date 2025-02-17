import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static int[] parents;
    static List<List<Integer>> list = new ArrayList<>();
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int node = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for (int i = 0; i <= node; i++) {
            list.add(new ArrayList<>());
        }
        
        for (int i = 0; i < node - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }
        
        visited = new boolean[node+1];
        parents = new int[node+1];
        
        dfs(1);
        for (int i = 2; i <= node; i++) {
            System.out.println(parents[i]);
        }
    }
    
    private static void dfs(int currentNode) {
        visited[currentNode] = true;
        
        for (int child : list.get(currentNode)) {
            if (!visited[child]) {
                parents[child] = currentNode;
                dfs(child);
            }
        }
    }
}