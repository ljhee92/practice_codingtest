import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] S;
    static int min = Integer.MAX_VALUE;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        S = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                S[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();

        findMin(0, 0);
        bw.write(min + "\n");
        bw.flush();
        bw.close();
    }

    private static void findMin(int index, int depth) {
        if (depth == N / 2) {
            min = Math.min(min, calculate());
            return;
        }

        for (int i = index; i < N; i++) {
            visited[i] = true;
            findMin(i+1, depth+1);
            visited[i] = false;
        }
    }

    private static int calculate() {
        int start = 0;
        int link = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i; j < N; j++) {
                if (visited[i] && visited[j]) {
                    start += S[i][j];
                    start += S[j][i];
                }

                if (!visited[i] && !visited[j]) {
                    link += S[i][j];
                    link += S[j][i];
                }
            }
        }

        return Math.abs(start - link);
    }
}