import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String number = String.valueOf(n);
        String[] numbers = number.split("");
        
        for(String splitedNumber : numbers) {
            answer += Integer.parseInt(splitedNumber);
        }

        return answer;
    }
}