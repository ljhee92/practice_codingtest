import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int N, house;
    static List<Integer> size;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(s[j]);
            }
        }

        int count = 0;
        size = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                house = 0;
                if (map[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    size.add(house);
                    count++;
                }
            }
        }

        System.out.println(count);

        Collections.sort(size);
        for (int num : size) {
            System.out.println(num);
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        int[] X = {0, 0, -1, 1};
        int[] Y = {-1, 1, 0, 0};
        house += 1;

        for (int i = 0; i < 4; i++) {
            int now_x = x + X[i];
            int now_y = y + Y[i];

            if (now_x < 0 || now_x >= N || now_y < 0 || now_y >= N) {
                continue;
            }

            if (map[now_x][now_y] == 1 && !visited[now_x][now_y]) {
                dfs(now_x, now_y);
            }
        }
    }
}