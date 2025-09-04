import java.io.*;
import java.util.*;

public class Main {
    
    static int n, m;
    static int[] arr;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int min = Arrays.stream(arr).max().getAsInt();
        int max = Arrays.stream(arr).sum();
        int answer = max;
        
        while (min <= max) {
            int mid = (min+max)/2;
            if (canDivide(mid)) {
                answer = mid;
                max = mid-1;
            } else {
                min = mid+1;
            }
        }
        
        System.out.println(answer);
    }
    
    static boolean canDivide(int size) {
        int count = 1;
        int sum = 0;
        
        for (int length : arr) {
            if (sum+length > size) {
                count++;
                sum = 0;
            }
            sum += length;
        }
        
        return count <= m;
    }
}
