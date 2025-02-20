import java.io.*;
import java.util.*;

public class Main {
    static int n, m, r;
    static boolean[] visited;
    static int[] result;
    static List<List<Integer>> list = new ArrayList<>();
    static int count = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];
        result = new int[n+1];

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list.get(u).add(v);
            list.get(v).add(u);
        }

        dfs(r);
        for (int i = 1; i <= n; i++) {
            System.out.println(result[i]);
        }
    }

    private static void dfs(int currentNumber) {
        visited[currentNumber] = true;
        result[currentNumber] = count++;
        list.get(currentNumber).sort(Comparator.naturalOrder());
        for (int value : list.get(currentNumber)) {
            if (!visited[value]) {
                dfs(value);
            }
        }
    }
}