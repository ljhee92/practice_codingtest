class Solution {
    public String solution(String n_str) {
        StringBuilder answer = new StringBuilder();
        String[] strArray = n_str.split("");
        
        for(int i = 0; i < strArray.length; i++) {
            if(strArray[i].equals("0")) {
                continue;
            } else {
                answer.append(n_str.substring(i));
                break;
            }
        }
        
        return answer.toString();
    }
}