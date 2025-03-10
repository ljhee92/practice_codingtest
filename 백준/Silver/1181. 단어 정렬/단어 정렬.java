import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        List<String> list = new ArrayList<>(set);
        
        list.sort((v1, v2) -> {
           if (v1.length() > v2.length()) {
               return 1;
           } else if (v1.length() < v2.length()) {
               return -1;
           } else {
               return v1.compareTo(v2);
           }
        });
        
        for (String str : list) {
            System.out.println(str);
        }
    }
}