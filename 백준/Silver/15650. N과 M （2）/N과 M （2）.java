import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        dfs(0, 0);
        System.out.println(sb);
    }

    static void dfs(int start, int depth) {
        if (depth == m) {
            for (int number : arr) {
                sb.append(number).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < n; i++) {
            arr[depth] = i+1;
            dfs(i+1, depth+1);
        }
    }
}
