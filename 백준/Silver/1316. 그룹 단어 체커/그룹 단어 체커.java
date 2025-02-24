import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (isGroupString(br.readLine())) {
                count++;
            }
        }
        System.out.println(count);
    }
    
    private static boolean isGroupString(String word) {
        boolean[] visited = new boolean[26];
        int prev = 0;
        for (int i = 0; i < word.length(); i++) {
            int ch = word.charAt(i);
            if (prev != ch) {
                if (visited[ch - 'a'] == false) {
                    visited[ch - 'a'] = true;
                    prev = ch;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}