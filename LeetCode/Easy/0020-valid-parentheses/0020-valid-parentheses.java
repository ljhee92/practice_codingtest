class Solution {
    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                deque.push(')');
            } else if (c == '[') {
                deque.push(']');
            } else if (c == '{') {
                deque.push('}');
            } else { // 닫는 괄호라면
                if (deque.isEmpty() || deque.pop() != c) {
                    return false;
                }
            }
        }

        return deque.isEmpty();
    }
}