class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String[] strAges = String.valueOf(age).split("");
        
        for(int i = 0 ;i < strAges.length; i++) {
            switch(strAges[i]) {
                case "0" : answer.append("a"); break;
                case "1" : answer.append("b"); break;
                case "2" : answer.append("c"); break;
                case "3" : answer.append("d"); break;
                case "4" : answer.append("e"); break;
                case "5" : answer.append("f"); break;
                case "6" : answer.append("g"); break;
                case "7" : answer.append("h"); break;
                case "8" : answer.append("i"); break;
                case "9" : answer.append("j");
            }
        }
        return answer.toString();
    }
}