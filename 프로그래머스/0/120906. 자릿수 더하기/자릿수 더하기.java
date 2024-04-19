class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] strs = String.valueOf(n).split("");
        
        for(int i = 0; i < strs.length; i++) {
            answer += Integer.parseInt(strs[i]);
        }
        return answer;
    }
}