import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        List<String> alphabets = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabets.size(); i++) {
            int index = word.indexOf(alphabets.get(i));
            sb.append(index).append(" ");
        }
        System.out.println(sb);
    }
}