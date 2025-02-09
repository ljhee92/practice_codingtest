import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        
        Deque<Integer> stack = new ArrayDeque<>();
        List<String> results = new ArrayList<>();
        int index = 0;
        for (int i = 1; i <= n; i++) {
            stack.push(i);
            results.add("+");
            
            while (!stack.isEmpty() && stack.peek() == numbers[index]) {
                stack.pop();
                results.add("-");
                index++;
            }
        }
        
        if (!stack.isEmpty()) {
            System.out.println("NO");
            return;
        }
        
        for (int i = 0; i < results.size(); i++) {
            System.out.println(results.get(i));
        }
    }
}