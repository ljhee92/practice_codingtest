import java.io.*;
import java.util.*;

public class Main {
    static int n, m, k;
    static int[][] map;
    static boolean[][] visited;
    static int size;
    static List<Integer> area = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        map = new int[m][n];
        visited = new boolean[m][n];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            for (int j = startX; j < endX; j++) {
                for (int k = startY; k < endY; k++) {
                    map[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 0 && !visited[i][j]) {
                    size = 1;
                    dfs(i, j);
                    area.add(size);
                }
            }
        }

        area.sort(Comparator.naturalOrder());

        System.out.println(area.size());
        area.forEach(value -> System.out.print(value + " "));
    }

    private static void dfs(int x, int y) {
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nowX = x + dx[i];
            int nowY = y + dy[i];

            if (nowX < 0 || nowX >= m || nowY < 0 || nowY >= n) {
                continue;
            }

            if (map[nowX][nowY] == 0 && !visited[nowX][nowY]) {
                size++;
                dfs(nowX, nowY);
            }
        }
    }
}