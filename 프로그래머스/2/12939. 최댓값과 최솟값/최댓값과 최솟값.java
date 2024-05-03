import java.util.Arrays;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] strs = s.split(" ");
        int[] numbers = new int[strs.length];
        
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(strs[i]);
        } // end for
        
        Arrays.sort(numbers);
        
        answer.append(numbers[0]).append(" ").append(numbers[numbers.length-1]);
        return answer.toString();
    }
}