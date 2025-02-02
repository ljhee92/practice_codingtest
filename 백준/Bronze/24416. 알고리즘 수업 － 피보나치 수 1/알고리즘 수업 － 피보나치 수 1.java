import java.io.*;

public class Main {
    static int count_fib = 1;
    static int count_fibonacci;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        fib(n);
        fibonacci(n);

        System.out.println(count_fib + " " + count_fibonacci);
    }

    private static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            count_fib++;
            return fib(n-1) + fib(n-2);
        }
    }

    private static int fibonacci(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            count_fibonacci++;
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}