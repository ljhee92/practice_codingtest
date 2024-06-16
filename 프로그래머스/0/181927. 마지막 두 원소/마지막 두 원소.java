class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length+1];
        
        for(int i = 0; i < answer.length-1; i++) {
            answer[i] = num_list[i];
        }
        
        if(num_list[length-1] > num_list[length-2]) {
            answer[answer.length-1] = num_list[length-1] - num_list[length-2];
        } else {
            answer[answer.length-1] = 2 * num_list[length-1];
        }
        
        return answer;
    }
}