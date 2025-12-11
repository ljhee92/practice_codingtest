import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            answer[i] = findNum(array, command);
        }
        
        return answer;
    }
    
    private int findNum(int[] array, int[] command) {
        int left = command[0];
        int right = command[1];
        int index = command[2]-1;
        
        List<Integer> list = new ArrayList<>();
        for (int i = left-1; i < right; i++) {
            list.add(array[i]);
        }
        Collections.sort(list);
        
        return list.get(index);
    }
}