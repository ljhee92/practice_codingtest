import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!list.contains(ch)) {
                answer[i] = -1;
            } else {
                int idx = list.lastIndexOf(ch);
                answer[i] = i-idx;
            }
            list.add(ch);
        }
        
        return answer;
    }
}