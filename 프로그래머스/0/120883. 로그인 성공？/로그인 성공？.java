import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        String id = id_pw[0];
        String pw = id_pw[1];
        
        Map<String, String> accounts = new HashMap<String, String>();
        
        for(int i = 0; i < db.length; i++) {
            accounts.put(db[i][0], db[i][1]);
            
            if(accounts.containsKey(id) && accounts.get(id).equals(pw)) {
                answer = "login";
            } else if(accounts.containsKey(id) && !accounts.get(id).equals(pw)) {
                answer = "wrong pw";
            } else {
                answer = "fail";
            } // eld else
        } // end for
        
        return answer;
    }
}