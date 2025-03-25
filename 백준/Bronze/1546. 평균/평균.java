import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            scores.add(Integer.parseInt(st.nextToken()));
        }
        
        double result = 0.0;
        int max = Collections.max(scores);
        for (int i = 0; i < n ; i++) {
            result += (double) scores.get(i) / max * 100;
        }
        System.out.println(result / n);
    }
}