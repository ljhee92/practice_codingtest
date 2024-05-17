class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] numbers = String.valueOf(order).split("");
        
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i].equals("3") || numbers[i].equals("6") || numbers[i].equals("9")) {
                answer++;
            }
        }
        
        return answer;
    }
}