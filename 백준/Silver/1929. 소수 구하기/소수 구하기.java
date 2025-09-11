import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        // 2초 -> 2억
        // m, n 최대값 1,000,000 -> n^2 불가
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        // 소수 : 약수가 1과 나 자신인 수
        StringBuilder sb = new StringBuilder();
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }

    private static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }

        // 2부터 sqrt까지 나눴을 때 나머지가 존재해야 소수다!
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
