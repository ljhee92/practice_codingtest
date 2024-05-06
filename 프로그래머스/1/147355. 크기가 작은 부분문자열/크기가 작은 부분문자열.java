class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        String sub = "";
        int pLength = p.length();
        
        for(int i = 0; i < t.length()-p.length()+1; i++) {
            sub = t.substring(i, pLength);
            pLength += 1;
            if(Long.parseLong(sub) <= Long.parseLong(p)) {
                answer++;
            }
        }
                
        return answer;
    }
}