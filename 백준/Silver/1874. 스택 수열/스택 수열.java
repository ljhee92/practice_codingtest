import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }
        
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int pushNumber = 1;
        for (int number : numbers) {
            while (pushNumber <= number) {
                stack.push(pushNumber++);
                sb.append("+\n");
            }
            
            if (stack.peek() == number) {
                stack.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}
