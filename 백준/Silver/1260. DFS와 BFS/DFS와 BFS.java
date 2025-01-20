import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static boolean[] visited;
    static int[][] arr;
    static int node, line, start;
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        node = Integer.parseInt(st.nextToken()); 
        line = Integer.parseInt(st.nextToken()); 
        start = Integer.parseInt(st.nextToken()); 

        arr = new int[node+1][node+1];

        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            arr[a][b] = arr[b][a] = 1; // 양방향 간선
        }

        visited = new boolean[node+1];
        dfs(start);
        sb.append("\n");
        
        visited = new boolean[node+1];
        bfs(start);

        System.out.println(sb);
    }

    private static void dfs(int node) {
        visited[node] = true; // 현재 노드 방문 처리
        sb.append(node + " "); // 방문 노드 출력
        
        if (node == arr.length) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            // 현재 정점과 연결된 정점 중 아직 방문하지 않은 정점일 경우
            if (arr[node][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int node) {
        q.add(node); // 시작 정점 큐에 먼저 추가
        visited[node] = true; // 현재 정점 방문 처리

        while (!q.isEmpty()) {
            node = q.poll();
            sb.append(node + " "); // 큐에서 꺼낸 노드 출력
            
            for (int i = 1; i < arr.length; i++) {
                // 큐에서 꺼낸 정점과 연결된 정점이며 아직 방문하지 않았을 때
                if (arr[node][i] == 1 && !visited[i]) {
                    q.add(i); // 연결된 정점 큐에 추가
                    visited[i] = true; // 연결된 정점 방문 처리
                }
            }
        }
    }
}