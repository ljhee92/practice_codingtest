class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] numbers = new int[absolutes.length];
        for(int i = 0; i < signs.length; i++) {
            if(signs[i]) {
                numbers[i] = absolutes[i];
            } else {
                numbers[i] = -absolutes[i];
            }
            answer += numbers[i];
        }
        return answer;
    }
}