class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        int index = s.length() / 2;
        if(s.length() % 2 != 0) {
            answer.append(s.charAt(index));
        } else {
            answer.append(s.charAt(index-1)).append(s.charAt(index));
        }
        
        return answer.toString();
    }
}