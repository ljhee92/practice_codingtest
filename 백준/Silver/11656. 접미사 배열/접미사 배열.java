import java.io.*;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int size = word.length();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = word.substring(i);
        }
        Arrays.sort(words);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(words[i]).append("\n");
        }
        System.out.println(sb);
    }
}
