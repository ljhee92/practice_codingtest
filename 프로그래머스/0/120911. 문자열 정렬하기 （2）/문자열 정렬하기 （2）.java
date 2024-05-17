import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        String lowCaseChar = my_string.toLowerCase();
        String[] chars = lowCaseChar.split("");
        
        Arrays.sort(chars);
        
        for(String c : chars) {
            answer.append(c);
        }
        
        return answer.toString();
    }
}