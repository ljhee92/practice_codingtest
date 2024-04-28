class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] array = s.toCharArray();
        
        int cntP = 0;
        int cntY = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 'p' || array[i] == 'P') {
                cntP++;
            } else if(array[i] == 'y' || array[i] == 'Y') {
                cntY++;
            }
        }
        
        if(cntP != cntY) {
            answer = false;
        }

        return answer;
    }
}