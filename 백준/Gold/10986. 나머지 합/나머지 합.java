import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // 시간제한 1초 -> 1억 번
        // n 최대 1,000,000
        // m 최대 1,000
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 1 3 6 7 9
        // 1 0 0 1 0
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken()) % m;
        long answer = 0;
        for (int i = 1; i < n; i++) {
            arr[i] = (arr[i-1] + Integer.parseInt(st.nextToken())) % m;
        }

        long[] count = new long[m]; // 0 1 2
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                answer++;
            } 
            count[arr[i]]++;
        }

        for (int i = 0; i < m; i++) {
            if (count[i] > 1) { 
                answer += (count[i] * (count[i] - 1)) / 2;
            }
        }
        System.out.println(answer);
    }
}
