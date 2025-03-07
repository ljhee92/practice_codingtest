import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static String[][] map;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new String[n][n];

        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().split("");
        }

        int count = 0;
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, map[i][j]);
                    count++;
                }
            }
        }

        int countRedEqualsGreen = 0;
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    dfsRedEqualsGreen(i, j, map[i][j]);
                    countRedEqualsGreen++;
                }
            }
        }

        System.out.println(count + " " + countRedEqualsGreen);
    }

    private static void dfs(int x, int y, String color) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nowX = x + dx[i];
            int nowY = y + dy[i];

            if (nowX < 0 || nowX >= n || nowY <0 || nowY >= n) {
                continue;
            }

            if (map[nowX][nowY].equals(color) && !visited[nowX][nowY]) {
                dfs(nowX, nowY, color);
            }
        }
    }

    private static void dfsRedEqualsGreen(int x, int y, String color) {
        visited[x][y] = true;

        for (int i = 0 ; i < 4; i++) {
            int nowX = x + dx[i];
            int nowY = y + dy[i];

            if (nowX < 0 || nowX >= n || nowY <0 || nowY >= n) {
                continue;
            }

            if (!visited[nowX][nowY]) {
                if ((color.equals("R") || color.equals("G"))
                        && (map[nowX][nowY].equals("R") || map[nowX][nowY].equals("G"))) {
                    dfsRedEqualsGreen(nowX, nowY, color);
                } else if (map[nowX][nowY].equals(color)) {
                    dfsRedEqualsGreen(nowX, nowY, color);
                }
            }
        }
    }
}