class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                answer.append("수");
            } else {
                answer.append("박");
            } // end else
        } // end for
        
        return answer.toString();
    }
}