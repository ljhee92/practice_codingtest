import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = array[0];
        int min = Math.abs(n-array[0]);
        
        for(int i = 1; i < array.length; i++) {
            if(Math.abs(n-array[i]) < min) {
                min = Math.abs(n-array[i]);
                answer = array[i];
            } // end if
            
            if(Math.abs(n-array[i]) == min) {
                continue;
            } // end if
        } // end for
        
        return answer;
    }
}