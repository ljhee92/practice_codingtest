import java.io.*;
import java.util.*;

public class Main {
    static int date;
    static int[] T;
    static int[] P;
    static int max = 0;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        date = Integer.parseInt(br.readLine());
        T = new int[date];
        P = new int[date];
        
        for (int i = 0; i < date; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }
        
        findMax(0, 0);
        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }
    
    public static void findMax(int now, int sum) {
        // 종료 시
        if (now == date) {
            max = Math.max(max, sum);
            return;
        }
        
        // 상담을 할 때
        if (now + T[now] <= date) {
            findMax(now + T[now], sum + P[now]);
        }
        
        // 상담을 하지 않을 때
        findMax(now + 1, sum);
    }
}