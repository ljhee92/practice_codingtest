import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            
            int[] dp = new int[n+1];
            for (int j = 1; j <= n; j++) {
                dp[j] = j;
            }
            
            for (int j = 1; j <= k ; j++) {
                for (int l = 2; l <= n; l++) {
                    dp[l] = dp[l-1] + dp[l];
                }
            }
            
            System.out.println(dp[n]);
        }
    }
}