class Solution {
    public String solution(String phone_number) {
        String[] numbers = phone_number.split("");
        
        for(int i = 0; i < numbers.length-4; i++) {
            numbers[i] = "*";
        } // end for
        
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < numbers.length; i++) {
            answer.append(numbers[i]);
        } // end for
       
        return answer.toString();
    }
}