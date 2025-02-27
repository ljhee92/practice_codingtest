import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        
        int maxHeight = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(map[i][j], maxHeight);
            }
        }
        
        int result = 1;
        for (int height = 1; height <= maxHeight; height++) {
            visited = new boolean[n][n];
            int count = 0;
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] > height && !visited[i][j]) {
                        dfs(i, j, height);
                        count++;
                    }
                }
            }
            
            result = Math.max(result, count);
        }
        
        System.out.println(result);
    }
    
    private static void dfs(int x, int y, int height) {
        visited[x][y] = true;
        
        for (int i = 0; i < 4; i++) {
            int nowX = x + dx[i];
            int nowY = y + dy[i];
            
            if (nowX < 0 || nowX >= n || nowY < 0 || nowY >= n) {
                continue;
            }
            
            if (map[nowX][nowY] > height && !visited[nowX][nowY]) {
                dfs(nowX, nowY, height);
            }
        }
    }
}