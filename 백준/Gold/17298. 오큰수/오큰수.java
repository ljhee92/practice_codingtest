import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // 1초 -> 1억 번
        // n 최대 1,000,000 -> nlogn 2천만
        // An 최대 1,000,000
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] result = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            result[i] = -1;
        }

        // i=0 arr[0]=3 stack=[] stack.push(0)
        // i=1 arr[1]=5 stack=[0] 3(stack.peek)<5 stack.pop(), stack.push(1)
        // i=2 arr[2]=2 stack=[1] 5(stack.peek)>2 stack.push(2)
        // i=3 arr[3]=7 stack=[1,2] 2(stack.peek)<7 stack.pop()
        //              stack=[1] 5(stack.peek)<7 stack.pop(), stack.push(3)
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < n; i++) {
            int now = arr[i];
            while(!stack.isEmpty() && arr[stack.peek()] < now) {
                int prevIndex = stack.pop();
                result[prevIndex] = now;
            }
            stack.push(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb);
    }
}
