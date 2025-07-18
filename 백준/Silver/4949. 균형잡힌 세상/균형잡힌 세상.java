import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        List<String> sentences = new ArrayList<>();
        while (true) {
            String input = br.readLine();
            sentences.add(input);
            if (input.equals(".")) {
                break;
            }
        }
        
        int lastIndex = sentences.size()-1;
        sentences.remove(lastIndex);
        
        for (String sentence : sentences) {
            System.out.println(solve(sentence));
        }
    }    
    
    static String solve(String sentence) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.empty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            } else if (c == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }
        
        if (stack.empty()) {
            return "yes";
        } else {
            return "no";
        }
    }
}
