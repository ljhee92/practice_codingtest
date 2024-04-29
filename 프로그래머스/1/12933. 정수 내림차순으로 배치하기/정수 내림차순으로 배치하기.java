import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String number = String.valueOf(n);
        String[] array = number.split("");
        List<Integer> numbers = new ArrayList<Integer>();
        
        for(int i = 0; i < number.length(); i++) {
            numbers.add(Integer.parseInt(array[i]));
        }
        
        Collections.sort(numbers);
        
        String answerStr = "";
        for(int i = numbers.size()-1; i > -1; i--) {
            answerStr += numbers.get(i);
        }
        
        answer = Long.parseLong(answerStr);
        return answer;
    }
}