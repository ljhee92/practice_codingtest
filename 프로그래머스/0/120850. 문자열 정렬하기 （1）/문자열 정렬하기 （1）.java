import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String[] str = my_string.split("");
        List<Integer> list = new ArrayList<>();
        
        for(String s : str) {
            if(!s.matches("[a-z]")){
                list.add(Integer.parseInt(s));
            }
        }
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}