import java.util.*;

class Solution {
    public int[] solution(int[] arr) {      
        List<Integer> numbers = new ArrayList<Integer>();
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            } // end if
            numbers.add(arr[i]);
        } // end for
        numbers.remove((Object)min);
        
        if(numbers.isEmpty()) {
            numbers.add(-1);
        } // end if
        
        int[] answer = new int[numbers.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = numbers.get(i);
        } // end for
        
        return answer;
    }
}