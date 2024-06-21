class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String[] strArr = myString.split("");
        StringBuilder newString = new StringBuilder();
        
        for(String s : strArr) {
            if(s.equals("A")) {
                newString.append("B");
            } else {
                newString.append("A");
            }
        }
        
        if(newString.toString().contains(pat)) {
            answer = 1;
        }
        
        return answer;
    }
}