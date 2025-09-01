import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(line[j]);
            }
        }

        visited = new boolean[n][m];
        bfs(0, 0);
        System.out.println(map[n-1][m-1]);
    }

    static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];
            
            for (int i = 0; i < 4; i++) {
                int a = currentX + dx[i];
                int b = currentY + dy[i];

                if (a >= 0 && b >= 0 && a < n && b < m) {
                    if (map[a][b] != 0 && !visited[a][b]) {
                        visited[a][b] = true;
                        map[a][b] = map[currentX][currentY]+1;
                        queue.add(new int[]{a, b});
                    }
                }
            }
        }
    }
}
