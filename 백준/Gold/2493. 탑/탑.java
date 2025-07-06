import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Stack<int[]> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int cur = arr[i];
            
            while (!stack.isEmpty()) {
                if (stack.peek()[1] >= cur) {
                    sb.append(stack.peek()[0] + " ");
                    break;
                }
                stack.pop();
            }
            
            if (stack.isEmpty()) {
                sb.append("0 ");
            }
            
            stack.push(new int[]{i, cur});
        }
        
        System.out.println(sb);
    }
}