import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        int maxNumber = array[0];
        int maxIndex = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] > maxNumber) {
                maxNumber = array[i];
                maxIndex = i;
            }
        }
        
        answer[0] = maxNumber;
        answer[1] = maxIndex;
        
        return answer;
    }
}