class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] chars = my_string.toCharArray();
        
        for(int i = 0; i < chars.length; i++) {
            if(Character.isDigit(chars[i])) {
                answer += Integer.parseInt(String.valueOf(chars[i]));
            } // end if
        } // end for
        
        return answer;
    }
}