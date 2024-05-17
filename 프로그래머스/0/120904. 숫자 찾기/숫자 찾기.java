class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String number = String.valueOf(num);
        String[] numbers = number.split("");
        
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i].equals(String.valueOf(k))) {
                answer = i+1;
                break;
            }
        }
        
        return answer;
    }
}