import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        int sum = 0;
        int left = 0;
        int right = 0;
        int count = 0;
        
        while (right <= n) {
            if (sum >= n) {
                sum -= arr[left++];
            } else if (sum < n) {
                sum += arr[right++];
            }
            if (sum == n) {
                count++;
            }
        }

        System.out.println(count);
    }
}