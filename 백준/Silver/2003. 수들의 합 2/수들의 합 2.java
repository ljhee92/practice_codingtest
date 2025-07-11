import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int sum = 0;
        int left = 0;
        int right = 0;
        int count = 0;
        
        while (right <= n) {
            if (sum >= m) {
                sum -= arr[left++]; 
            } else if(sum < m) {
                sum += arr[right++];
            }
            if (sum == m) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}