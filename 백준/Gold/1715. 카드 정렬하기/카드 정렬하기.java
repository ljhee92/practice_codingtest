import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        // 2초 -> 2억
        // n 최대 100,000 -> n^2 불가
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            priorityQueue.offer(num);
        }
        
        int answer = 0;
        while (priorityQueue.size() != 1) {
            int a = priorityQueue.poll();
            int b = priorityQueue.poll();
            int sum = a+b;
            priorityQueue.offer(sum);
            answer += sum;
        }
        System.out.println(answer);
    }
}
