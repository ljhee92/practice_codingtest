import java.io.*;
import java.util.*;

public class Main {

    static int n, m, v;
    static List<Integer>[] list;
    static StringBuilder sb = new StringBuilder();
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 정점의 개수
        m = Integer.parseInt(st.nextToken()); // 간선의 개수
        v = Integer.parseInt(st.nextToken()); // 탐색 시작 정점

        list = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        // 정점 번호가 작은 것을 먼저 방문 -> 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(list[i]);
        }

        visited = new boolean[n+1];
        dfs(v);
        sb.append("\n");

        Arrays.fill(visited, false);
        bfs(v);
        
        System.out.println(sb);
    }

    static void dfs(int start) {
        visited[start] = true;
        sb.append(start).append(" ");
        for (int num : list[start]) {
            if (!visited[num]) {
                dfs(num);
            }
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            sb.append(current).append(" ");

            for (int num : list[current]) {
                if (!visited[num]) {
                    visited[num] = true;
                    queue.add(num);
                }
            }
        }
    }
}
