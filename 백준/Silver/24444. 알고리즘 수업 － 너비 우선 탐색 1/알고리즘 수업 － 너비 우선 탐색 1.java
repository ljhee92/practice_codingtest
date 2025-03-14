import java.io.*;
import java.util.*;

public class Main {
    static int n, m, r;
    static boolean[] visited;
    static int[] visitOrder;
    static List<List<Integer>> list = new ArrayList<>();
    static Queue<Integer> queue = new ArrayDeque<>();
    static int count = 1;

    public static void main(String[] args) throws Exception {
        // n, m, r 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        // 방문 확인 배열 생성
        visited = new boolean[n+1];
        visitOrder = new int[n+1];

        // 연결 리스트 생성
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list.get(u).add(v);
            list.get(v).add(u);
        }

        // 정점 오름차순 정렬
        for (int i = 1; i <= n; i++) {
            list.get(i).sort(Comparator.naturalOrder());
        }

        // bfs
        bfs(r);

        // 방문 순서 배열 출력
        for (int i = 1; i <= n; i++) {
            System.out.println(visitOrder[i]);
        }
    }

    private static void bfs(int start) {
        // 큐에 시작 정점 삽입
        queue.offer(start);
        visited[start] = true;
        visitOrder[start] = count++;

        while(!queue.isEmpty()) {
            // bfs (큐에서 정점을 꺼내면서 방문 순서 기록), 방문 체크
            int now = queue.poll();

            // 꺼낸 노드의 인접 노드 확인
            for (int i = 0; i < list.get(now).size(); i++) {
                int node = list.get(now).get(i);

                if (!visited[node]) {
                    queue.offer(node);
                    visited[node] = true;
                    visitOrder[node] = count++;
                }
            }
        }
    }
}