import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int maxNumber = array[0];
        int maxIndex = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] > maxNumber) {
                maxNumber = array[i];
                maxIndex = i;
            }
        }
        
        int[] answer = {maxNumber, maxIndex};
        return answer;
    }
}