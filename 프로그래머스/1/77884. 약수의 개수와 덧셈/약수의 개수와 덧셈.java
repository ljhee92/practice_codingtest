import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for(int i = left; i <= right; i++) {
            List<Integer> factors = new ArrayList<Integer>();
            
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    factors.add(j);
                    map.put(i, factors);
                } // end if
            } // end for
            
            if(map.get(i).size() % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            } // end else
        } // end for
        return answer;
    }
}