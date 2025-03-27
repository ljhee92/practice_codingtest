import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < c; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int sum = 0;
            List<Integer> scores = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                scores.add(num);
                sum += num;
            }

            double average = (double) sum / n;
            double count = 0;
            for (int j = 0; j < scores.size(); j++) {
                if (average < scores.get(j)) {
                    count++;
                }
            }
            
            double result = count / n * 100;
            System.out.printf("%.3f%%%n", result);
        }
    }
}