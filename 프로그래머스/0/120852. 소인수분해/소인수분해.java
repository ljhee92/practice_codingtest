import java.util.*;
class Solution {
    public int[] solution(int n) {        
        List<Integer> primes = new ArrayList<Integer>();
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                primes.add(i);
                n /= i;
                i = 1;
            } // end if
        } // end for
        
        Set<Integer> set = new HashSet<Integer>(primes);
        List<Integer> removeDup = new ArrayList<Integer>(set);
        int[] answer = new int[removeDup.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = removeDup.get(i);
        } // end for
        
        Arrays.sort(answer);
        return answer;
    }
}