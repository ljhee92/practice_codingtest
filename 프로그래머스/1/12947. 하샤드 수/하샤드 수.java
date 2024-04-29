class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String[] numbers = String.valueOf(x).split("");
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }
        
        if(x % sum != 0) {
            answer = false;
        }
        
        return answer;
    }
}