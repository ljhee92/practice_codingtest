import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
            } // end if
        } // end for
        
        Collections.sort(list);
        
        if(list.isEmpty()) {
            list.add(-1);
        } // end if
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        } // end for
        
        return answer;
    }
}