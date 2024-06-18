import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        String[] strArray = my_string.split("");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        
        for(String s : strArray) {
            linkedHashSet.add(s);
        }
        
        Iterator iterator = linkedHashSet.iterator();
        while(iterator.hasNext()) {
            answer.append(iterator.next());
        }
        
        return answer.toString();
    }
}