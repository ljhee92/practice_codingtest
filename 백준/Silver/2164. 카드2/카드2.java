import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        
        for (int i = 1; i < N; i++) {
            queue.poll();
            int num = queue.poll();
            queue.add(num);
        }
        
        System.out.println(queue.poll());
    }
}