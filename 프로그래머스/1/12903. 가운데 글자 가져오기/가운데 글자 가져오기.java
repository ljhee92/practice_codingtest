class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        int index = s.length() / 2;
        if(s.length() % 2 != 0) {
            answer.append(String.valueOf(s.charAt(index)));
        } else {
            answer.append(String.valueOf(s.charAt(index-1))).append(String.valueOf(s.charAt(index)));
        }
        
        return answer.toString();
    }
}