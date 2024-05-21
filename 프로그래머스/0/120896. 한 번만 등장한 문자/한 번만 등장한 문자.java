import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        String[] characters = s.split("");
        int cnt = 0;
        
        Arrays.sort(characters);
        
        for(int i = 0; i < characters.length; i++) {
            cnt = 0;
            for(int j = 0; j < characters.length; j++) {
                if(characters[i].equals(characters[j])) {
                    cnt++;
                }
            }
            
            if(cnt == 1) {
                answer.append(characters[i]);
            }    
        }
        
        
        return answer.toString();
    }
}