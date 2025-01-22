import java.io.*;
import java.util.*;

public class Main {
    static int[][] ground;
    static boolean[][] visited;
    static int M, N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            ground = new int[M][N];
            visited = new boolean[M][N];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                ground[x][y] = 1;
            }

            int count = 0;
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if (ground[j][k] == 1 && !visited[j][k]) {
                        dfs(j, k);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        int[] X = {0, 0, -1, 1};
        int[] Y = {-1, 1, 0, 0};

        for (int i = 0; i < 4; i++) {
            int now_x = x + X[i];
            int now_y = y + Y[i];

            if (now_x < 0 || now_x >= M || now_y < 0 || now_y >= N) {
                continue;
            }

            if (ground[now_x][now_y] == 1 && !visited[now_x][now_y]) {
                dfs(now_x, now_y);
            }
        }
    }
}