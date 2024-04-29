class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        
        for(int number : arr) {
            sum += number;
        }
        
        answer = (double)sum / arr.length;
        return answer;
    }
}