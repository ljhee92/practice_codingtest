import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        // 6초 -> 6억 번
        // n, m 최대값 10,000 -> n^2 m^2 n*m 가능
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 문자열의 개수 n, m
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            s.add(br.readLine());
        }

        int answer = 0;
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (s.contains(str)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
