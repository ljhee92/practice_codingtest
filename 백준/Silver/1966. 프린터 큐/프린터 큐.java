import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            Deque<int[]> queue = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                queue.add(new int[]{j, Integer.parseInt(st.nextToken())});
            }
            
            int answer = 0;
            while (!queue.isEmpty()) {
                int[] first = queue.peek();
                boolean isMax = false;
                
                for (int[] doc : queue) {
                    if (doc[1] > first[1]) {
                        isMax = true;
                        break;
                    }
                }
                
                if (isMax) {
                    queue.addLast(queue.poll());
                } else {
                    queue.poll();
                    answer++;
                    
                    if (first[0] == M) {
                        System.out.println(answer);
                        break;
                    }
                }
            }
        }
    }
}