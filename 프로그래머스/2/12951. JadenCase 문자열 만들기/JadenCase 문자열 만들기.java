class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        String[] strs = s.split(" ");
        String[] chars = null;
        char end = s.charAt(s.length()-1);
        
        for(int i = 0; i < strs.length; i++) {
            chars = strs[i].split("");
            //System.out.println(strs[i]);
            for(int j = 0; j < chars.length; j++) {
                //System.out.println(chars[j]);
                if(j == 0) {
                    chars[j] = chars[j].toUpperCase();
                } else {
                    chars[j] = chars[j].toLowerCase();
                } // end else
                answer.append(chars[j]);
            } // end for
        
            if(i != strs.length-1) {
                answer.append(" ");
            } // end if
        } // end for
        
        if(end == ' ') {
            answer.append(" ");
        } // end if
        
        return answer.toString();
    }
}