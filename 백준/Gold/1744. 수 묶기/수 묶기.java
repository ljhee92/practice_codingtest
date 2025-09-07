import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        
        int sum = 0;
        for (int i = 0; i < n && arr[i] < 1; i+=2) {
            if (i+1 < n && arr[i+1] < 1) {
                sum += arr[i] * arr[i+1];
            } else {
                sum += arr[i];
            }
        }
        
        for (int i = n-1; i >= 0 && arr[i] > 1; i-=2) {
            if (i-1 >=0 && arr[i-1] > 1) {
                sum += arr[i] * arr[i-1];
            } else {
                sum += arr[i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                sum += arr[i];
            }
        }
        
        System.out.println(sum);
    }
}
