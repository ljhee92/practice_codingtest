import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        // 1초 -> 1억
        // N, Pi 최대 1,000 -> n^2 가능 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            answer += sum;
        }

        System.out.println(answer);
    }
}
