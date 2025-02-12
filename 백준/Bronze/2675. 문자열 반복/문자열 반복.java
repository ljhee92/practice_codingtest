import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String[] S = st.nextToken().split("");
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < S.length; j++) {
                sb.append(S[j].repeat(R));
            }
            System.out.println(sb);
        }
    }
}