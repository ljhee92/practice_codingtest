class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        String regex = ".*[^0-9].*";
        if((s.length() != 4 && s.length() != 6) || s.matches(regex)) {
            answer = false;            
        }
        return answer;
    }
}