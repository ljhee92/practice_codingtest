import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (stack.size() > 0 && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        
        if (stack.isEmpty()) {
            return 1;
        }
        
        return 0;
    }
}