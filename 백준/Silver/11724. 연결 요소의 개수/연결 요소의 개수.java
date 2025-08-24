import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static List<Integer>[] list;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        // 3초 -> 3억
        // n 최대 1,000
        // m 최대 500*999 = 499,500
        // n * m = 499,500,000 -> 불가
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 정점
        m = Integer.parseInt(st.nextToken()); // 노드

        list = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
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
