class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder(my_string);
        
        char num1Char = my_string.charAt(num1);
        char num2Char = my_string.charAt(num2);
        
        answer.setCharAt(num1, num2Char);
        answer.setCharAt(num2, num1Char);
        
        return answer.toString();
    }
}