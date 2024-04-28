class Solution {
    public int[] solution(long n) {
        String number = String.valueOf(n);
        int[] answer = new int[number.length()];
        int j = 0;
        for(int i = answer.length-1; i > -1; i--) {
            answer[j++] = Integer.parseInt(number.split("")[i]);
        }
        return answer;
    }
}