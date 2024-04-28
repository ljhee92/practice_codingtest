import java.util.*;
    
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        List<Integer> divisors = new ArrayList<Integer>();
        int number = 1;
        while(n / number > 0) {
            if(n % number == 0) {
                divisors.add(number);
            }
            number++;
        }
        
        for(int i = 0; i < divisors.size(); i++) {
            answer += divisors.get(i);
        }
        
        return answer;
    }
}