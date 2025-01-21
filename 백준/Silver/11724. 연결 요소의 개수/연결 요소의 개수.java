import java.io.*;
import java.util.*;

public class Main {
    static int N, M, answer;
    static List<Integer>[] list;
    static boolean[] visited;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        list = new ArrayList[N+1];
        visited = new boolean[N+1];
        
        for (int i = 0; i < N+1; i++) {
            list[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }
        
        System.out.println(answer);
    }
    
    private static void dfs(int start) {
        visited[start] = true;
        for (int num : list[start]) {
            if (!visited[num]) {
                dfs(num);
            }
        }
    }
}