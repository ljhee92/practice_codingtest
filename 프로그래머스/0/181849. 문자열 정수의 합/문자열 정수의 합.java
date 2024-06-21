class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        String[] num_char = num_str.split("");
        int[] numbers = new int[num_char.length];
        
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(num_char[i]);
            answer += numbers[i];
        }
        
        return answer;
    }
}