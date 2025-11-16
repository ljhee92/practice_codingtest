import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            if (ch == '(') {
                stack.push(ch);
            } else if (stack.empty()) {
                answer = false;
            } else {
                stack.pop();
            }
        }
        
        if (!stack.empty()) {
            answer = false;
        }

        return answer;
    }
}