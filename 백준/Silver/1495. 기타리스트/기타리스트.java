import java.io.*;
import java.util.*;

public class Main {
    static int N, S, M;
    static int[][] dp;
    static int[] V;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        dp = new int[N][M+1];
        V = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            V[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        
        if (S + V[0] <= M) {
            dp[0][S + V[0]] = 1;
        }
        
        if (S - V[0] >= 0) {
            dp[0][S - V[0]] = 1;
        }
        
        for (int i = 1; i < N; i++) {
            calculate(i);
        }
        
        System.out.println(getMax());
    }
    
    private static void calculate(int num) {
        for (int i = 0; i <= M; i++) {
            if (dp[num - 1][i] == 1) {
                if (i + V[num] <= M) {
                    dp[num][i + V[num]] = 1;
                }
                
                if (i - V[num] >= 0) {
                    dp[num][i - V[num]] = 1;
                }
            }
        }
    }
    
    private static int getMax() {
        for (int i = M; i >= 0; i--) {
            if (dp[N-1][i] == 1) {
                return i;
            }
        }
        return -1;
    }
}