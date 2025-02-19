import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] visited;
    static int[][] map;
    static int w, h;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        while (true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            
            if (w == 0 && h == 0) {
                break;
            }
            
            visited = new boolean[h][w];
            map = new int[h][w];
            
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
            int count = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1 && !visited[i][j]) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            
            System.out.println(count);
        }
    }
    
    private static void dfs(int x, int y) {
        visited[x][y] = true;
        int[] X = {0, 0, -1, 1, -1, 1, -1, 1};
        int[] Y = {1, -1, 0, 0, 1, 1, -1, -1};
        
        for (int i = 0; i < 8; i++) {
            int nowX = x + X[i];
            int nowY = y + Y[i];
            
            if (nowX < 0 || nowX >= h || nowY < 0 || nowY >= w) {
                continue;
            }
            
            if (map[nowX][nowY] == 1 && !visited[nowX][nowY]) {
                dfs(nowX, nowY);
            }
        }
    }
}