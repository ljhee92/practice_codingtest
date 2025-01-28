import java.io.*;

public class Main {
    static long[] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        dp = new long[n+1];
        fibonacci();
        System.out.println(dp[n]);
    }

    private static void fibonacci() {
        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
    }
}