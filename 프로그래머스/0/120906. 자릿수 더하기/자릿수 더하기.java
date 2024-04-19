class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] strs = String.valueOf(n).split("");
        int[] numbers = new int[strs.length];
        
        for(int i = 0; i < strs.length; i++) {
            numbers[i] = Integer.parseInt(strs[i]);
            answer += numbers[i];
        }
        return answer;
    }
}