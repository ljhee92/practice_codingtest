import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static boolean[][] visited;
    static int[][] map;
    static boolean check = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        visited = new boolean[n][n];
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);

        if (check) {
            System.out.println("HaruHaru");
            return;
        }

        System.out.println("Hing");
    }

    private static void dfs(int x, int y) {
        // -1인지 확인
        if (map[x][y] == -1) {
            check = true;
            return;
        }
        // 방문 체크
        visited[x][y] = true;
        
        // 이동 가능한지 확인(오른쪽, 아래쪽)
        int moveForRight = map[x][y] + y;
        int moveForBottom = map[x][y] + x;

        if (moveForRight < map.length) {
            if (!visited[x][moveForRight]) {
                dfs(x, moveForRight);
            }
        }

        if (moveForBottom < map.length) {
            if (!visited[moveForBottom][y]) {
                dfs(moveForBottom, y);
            }
        }
    }
}