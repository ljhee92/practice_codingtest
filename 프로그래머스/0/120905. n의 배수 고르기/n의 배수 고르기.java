import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answerList = new ArrayList<Integer>();
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                answerList.add(numlist[i]);
            } // end if
        } // end for
        
        int[] answer = new int[answerList.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        } // end for
        return answer;
    }
}