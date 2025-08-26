import java.io.*;
import java.util.*;

public class Main {
    
    static int n, m;
    static List<Integer>[] list;
    static boolean[] visited;
    static boolean found = false;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        list = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }
        
        visited = new boolean[n];
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        
        for (int i = 0; i < n; i++) {
            dfs(i, 1);
            if (found) {
                break;
            }
        }
        
        if (found) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    
    static void dfs(int number, int depth) {
        if (depth == 5) {
            found = true;
            return;
        }
        
        visited[number] = true;
        for (int next : list[number]) {
            if (!visited[next]) {
                dfs(next, depth+1);
                if (found) {
                    return;
                }
            }
        }
        visited[number] = false;
    }
}
