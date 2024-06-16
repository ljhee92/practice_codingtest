class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String suffixString = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            suffixString = my_string.substring(i, my_string.length());
            if(is_suffix.equals(suffixString.toString())) {
                answer = 1;
            }
        }
        
        return answer;
    }
}