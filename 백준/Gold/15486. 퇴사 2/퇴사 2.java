import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] T = new int[N+1];
        int[] P = new int[N+1];
        int[] dp = new int[N+2];

        StringTokenizer st;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        for (int i = 1; i <= N; i++) {
            // 상담을 하지 않는 경우
            dp[i] = Math.max(dp[i-1], dp[i]);

            // 상담을 하는 경우
            int nextDay = i + T[i] - 1;
            if (nextDay <= N) {
                dp[nextDay] = Math.max(dp[nextDay], dp[i-1]+P[i]);
            }
        }
        
        System.out.println(dp[N]);
    }
}