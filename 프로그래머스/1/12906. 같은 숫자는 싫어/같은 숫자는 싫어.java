import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> numbers = new ArrayList<Integer>();
        for(int number : arr) {
            numbers.add(number);
        } // end for
        
        List<Integer> chkNumbers = new ArrayList<Integer>();
        for(int i = 0; i < numbers.size(); i++) {
            if(chkNumbers.isEmpty()) {
                chkNumbers.add(numbers.get(i));
            } else {
                if(chkNumbers.get(chkNumbers.size()-1) == numbers.get(i)) {
                    continue;
                } else {
                    chkNumbers.add(numbers.get(i));
                } // end else
            } // end else
        } // end for
        
        int[] answer = new int[chkNumbers.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = chkNumbers.get(i);
        } // end for

        return answer;
    }
}