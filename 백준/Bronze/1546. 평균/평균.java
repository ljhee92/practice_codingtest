import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] scores = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(scores);
        int max = scores[n-1];

        double[] newScores = new double[n];
        for (int i = 0; i < n; i++) {
            newScores[i] = (double)scores[i] / max * 100;
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += newScores[i];
        }

        System.out.println(sum / n);
    }
}
