import java.util.*;

class Solution {
    public String solution(String s) {
        String[] chars = s.split("");
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < chars.length; i++) {
            list.add(chars[i]);
        } // end for
        
        Collections.sort(list);
        
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < list.size(); i++) {
            answer.append(list.get(i));
        } // end for
        answer.reverse();
        
        return answer.toString();
    }
}