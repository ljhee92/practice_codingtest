import java.util.*;
class Solution {
    public String solution(String letter) {
        Map<String, String> m = new HashMap<String, String>();
        m.put(".-","a");m.put("-...","b");m.put("-.-.","c");m.put("-..","d");
        m.put(".","e");m.put("..-.","f");m.put("--.","g");m.put("....","h");
        m.put("..","i");m.put(".---","j");m.put("-.-","k");m.put(".-..","l");
        m.put("--","m");m.put("-.","n");m.put("---","o");m.put(".--.","p");
        m.put("--.-","q");m.put(".-.","r");m.put("...","s");m.put("-","t");
        m.put("..-","u");m.put("...-","v");m.put(".--","w");m.put("-..-","x");
        m.put("-.--","y");m.put("--..","z");
        
        StringBuilder answer = new StringBuilder();
        String[] characters = letter.split(" ");
        
        for(int i = 0; i < characters.length; i++) {
            answer.append(m.get(characters[i]));
        }
        
        return answer.toString();
    }
}