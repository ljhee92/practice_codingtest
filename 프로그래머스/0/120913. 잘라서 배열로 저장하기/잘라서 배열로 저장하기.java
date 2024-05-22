import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<String>();
        int cnt = (int)Math.ceil((double)my_str.length() / n);
        
        for(int i = 0; i < cnt; i++) {
            if(i == cnt-1) {
                list.add(my_str.substring(i*n, my_str.length()));
            } else {
                list.add(my_str.substring(i*n, (i+1)*n));
            } // end else
        } // end for
                         
        String[] answer = new String[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        } // end for
        
        return answer;
    }
}