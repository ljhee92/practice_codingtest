class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        String[] numbers = new String[array.length];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            numbers[i] = String.valueOf(array[i]);
            sb.append(numbers[i]);
        } // end for
        
        String[] s = sb.toString().split("");
        for(String st : s) {
            if(st.equals("7")) {
                answer++;
            } // end if
        } // end for
        
        return answer;
    }
}