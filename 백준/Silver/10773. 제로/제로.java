import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < K; i++) {
            int number = Integer.parseInt(br.readLine());
            if (number != 0) {
                stack.push(number);
            } else {
                stack.pop();
            }
        }
        int answer = 0;
        Object[] numbers = stack.toArray();
        for (int i = 0; i < stack.size(); i++) {
            answer += (int)(numbers[i]);
        }
        System.out.println(answer);
    }
}