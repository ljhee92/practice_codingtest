import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] scores = new int[size+1];
        
        for (int i = 1; i <= size; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }
        
        int[] dp = new int[size+1];
        dp[1] = scores[1];
        if (size >= 2) {
            dp[2] = scores[1] + scores[2];
        }
        
        for (int i = 3; i <= size; i++) {
            dp[i] = Math.max(dp[i-2], dp[i-3] + scores[i-1]) + scores[i];
        }
        
        System.out.println(dp[size]);
    }
}