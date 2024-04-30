class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        long n = Math.abs(b-a)+1;
        
        answer = n * (a+b) / 2;
        
        return answer;
    }
}