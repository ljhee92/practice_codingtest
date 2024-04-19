import static java.lang.Character.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char[] chars = my_string.toCharArray();
        
        for(int i = 0; i < chars.length; i++) {
            if(isLowerCase(chars[i])) {
                chars[i] = toUpperCase(chars[i]);
            } else {
                chars[i] = toLowerCase(chars[i]);
            }
            answer.append(chars[i]);
        }
        
        return answer.toString();
    }
}