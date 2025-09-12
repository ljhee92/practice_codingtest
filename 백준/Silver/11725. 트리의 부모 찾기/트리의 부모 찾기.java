import java.io.*;
import java.util.*;

public class Main {

    static boolean[] visited;
    static int[] answer;
    static List<List<Integer>> tree = new ArrayList<>();
    
    public static void main(String[] args) throws Exception {
        // 1초 -> 1억 번
        // n 최대 100,000 -> n^2 불가
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 1 - 6 - 3 - 5
        //   - 4 - 2
        //       - 7
        // 4 6 1 3 1 4

        // 1 - 2 - 4 - 7
        //           - 8
        //   - 3 - 5 - 9
        //           - 10
        //       - 6 - 11
        //           - 12
        // 1 1 2 3 3 4 4 5 5 6 6

        StringTokenizer st;
        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree.get(a).add(b); 
            tree.get(b).add(a);
        }

        visited = new boolean[n+1];
        answer = new int[n+1];
        dfs(1);
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            sb.append(answer[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static void dfs(int node) {
        visited[node] = true;

        for (int child : tree.get(node)) {
            if (!visited[child]) {
                answer[child] = node;
                dfs(child);
            }
        }
    }
}
