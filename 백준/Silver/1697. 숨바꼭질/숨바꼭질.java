import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    static int[] visited = new int[100001];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        if (N == K) {
            System.out.println(0);
        } else {
            bfs(N);
        }
    }
    
    private static void bfs(int num) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(num);
        visited[num] = 1;
        
        while (!q.isEmpty()) {
            int now = q.poll();
            
            for (int i = 0; i < 3; i++) {
                int next;
                
                if (i == 0) {
                    next = now - 1;    
                } else if (i == 1) {
                    next = now + 1;
                } else {
                    next = now * 2;
                }
                
                if (next == K) {
                    System.out.println(visited[now]);
                    return;
                }
                
                if (next >= 0 && next < visited.length && visited[next] == 0) {
                    q.add(next);
                    visited[next] = visited[now] + 1;
                }
            }
        }
    }
}