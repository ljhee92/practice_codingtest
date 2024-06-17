class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] numbers = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        
        for(String s : numbers) {
            if(!s.equals("")) {
                answer += Integer.parseInt(s);
            }
        }
        
        return answer;
    }
}