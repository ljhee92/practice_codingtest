class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] strArray = s.split(" ");
        
        for(int i = 0; i < strArray.length; i++) {
            if(strArray[i].matches("[+-]?\\d*(\\.\\d+)?")){
                answer += Integer.parseInt(strArray[i]);
            }
            
            if(strArray[i].equals("Z")){
                answer -= Integer.parseInt(strArray[i-1]);
            }
        }
        
        return answer;
    }
}