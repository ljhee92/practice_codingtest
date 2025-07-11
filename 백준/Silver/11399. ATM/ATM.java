import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] p = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(p);
        
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer += p[i] * (n-i);
        }
        
        System.out.println(answer);
    }
}
