class Solution {
    public String solution(String cipher, int code) {
        String[] ciphers = cipher.split("");
        StringBuilder answer = new StringBuilder();
        
        for(int i = code; i <= ciphers.length; i+=code) {
            answer.append(ciphers[i-1]);
        }
        
        return answer.toString();
    }
}