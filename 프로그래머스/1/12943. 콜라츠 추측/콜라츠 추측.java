class Solution {
    public int solution(long num) {
        int answer = 0;
        
        for(int i = 0; i < 501; i++) {
            if(num == 1) {
                break;
            }
            if(num % 2 == 0) {
                num /= 2;
                answer++;
            } else {
                num = num * 3 + 1;
                answer++;
            }
        }
        
        if(answer == 501) {
            answer = -1;
        }
        
        return answer;
    }
}