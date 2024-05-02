import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        List<Integer> zeroToNine = new ArrayList<Integer>();
        
        for(int i = 0; i < 10; i++) {
            zeroToNine.add(i);
        } // end for
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < zeroToNine.size(); j++) {
                if(numbers[i] != zeroToNine.get(j)) {
                    continue;
                } else {
                    zeroToNine.remove(j);
                    break;
                } // end else
            } // end for
        } // end for
        
        int answer = 0;
        for(int i = 0; i < zeroToNine.size(); i++) {
            answer += zeroToNine.get(i);
        } // end for
        
        return answer;
    }
}