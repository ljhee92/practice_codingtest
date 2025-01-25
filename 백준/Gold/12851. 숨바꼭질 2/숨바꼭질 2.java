import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    static int[] visited = new int[100001];
    static int time = Integer.MAX_VALUE;
    static int count = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (N == K) {
            System.out.println(0);
            System.out.println(1);
        } else {
            bfs(N);
            System.out.println(time);
            System.out.println(count);
        }
    }

    public static void bfs(int num) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(num);
        visited[num] = 1;

        while(!q.isEmpty()) {
            int now = q.poll();

            if (time < visited[now]) {
                return;
            }

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) {
                    next = now - 1;
                } else if (i == 1) {
                    next = now + 1;
                } else {
                    next = now * 2;
                }

                if (next >= 0 && next < visited.length) {
                    if (next == K) {
                        time = visited[now];
                        count++;
                    }

                    if (visited[next] == 0 || visited[next] == visited[now] + 1) {
                        q.add(next);
                        visited[next] = visited[now] + 1;
                    }
                }
            }
        }
    }
}