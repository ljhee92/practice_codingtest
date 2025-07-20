import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long first = arr[n-1];
        long second = 1;
        
        for (int i = n-2; i >= 0; i--) {
            long temp = 0;

            second = first * arr[i] + second;
            temp = second;
            second = first;
            first = temp;
        }
        second = first - second;

        System.out.println(second + " " + first);
    }
}
