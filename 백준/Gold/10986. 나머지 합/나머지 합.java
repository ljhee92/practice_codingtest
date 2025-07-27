import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        long[] sum = new long[n];
        long[] count = new long[m];
        long answer = 0;

        st = new StringTokenizer(br.readLine());
        sum[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int mod = (int) (sum[i] % m);
            if (mod == 0) answer++;
            count[mod]++;
        }

        for (int i = 0; i < m; i++) {
            if (count[i] > 1) {
                answer = answer + (count[i] * (count[i]-1) / 2);
            }
        }

        System.out.println(answer);
    }
}
