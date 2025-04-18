import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            Deque<Character> stack = new ArrayDeque<>();
            String line = br.readLine();
            String answer = "YES";
            
            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')' && stack.size() > 0) {
                    stack.pop();
                } else if (c == ')' && stack.size() == 0) {
                    answer = "NO";
                }
            }
            
            if (stack.size() > 0) {
                answer = "NO";
            }
            
            System.out.println(answer);
        }
    }
}