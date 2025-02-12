import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] word = br.readLine().toUpperCase().split("");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length; i++) {
            if (map.containsKey(word[i])) {
                map.put(word[i], map.get(word[i])+1);
            } else {
                map.put(word[i], 1);
            }
        }

        Set<String> keySet = map.keySet();
        List<String> list = new ArrayList<>(keySet);
        int max = map.get(list.get(0));
        String answer = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (map.get(list.get(i)) > max) {
                max = map.get(list.get(i));
                answer = list.get(i);
            } else if (map.get(list.get(i)) == max) {
                answer = "?";
            }
        }
        
        System.out.println(answer);
    }
}