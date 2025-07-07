import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int left = 0;
        int min = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (sum >= s) {
                min = Math.min(min, right-left+1);
                sum -= arr[left++];
            }
        }

        int answer = min == Integer.MAX_VALUE ? 0 : min;
        System.out.println(answer);
    }
} 
