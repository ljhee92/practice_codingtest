class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        StringBuilder number = new StringBuilder();
        for(int a = i; a <= j; a++) {
            number.append(a);
        }
        
        String[] numbers = number.toString().split("");
        for(int b = 0; b < numbers.length; b++) {
            if(numbers[b].equals(String.valueOf(k))) {
                answer++;
            }
        }
        
        return answer;
    }
}