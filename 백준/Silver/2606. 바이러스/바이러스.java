import java.io.*;
import java.util.*;

public class Main {
    static int node, line, count;
    static boolean[] visited;
    static int[][] map;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());
        visited = new boolean[node+1];
        map = new int[node+1][node+1];
        StringTokenizer st;
        
        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = map[y][x] = 1; // 방향성 없으므로
        }
        
        count = 0;
        System.out.println(dfs(1));
    }
    
    private static int dfs(int i) {
        visited[i] = true;
        
        for (int j = 1; j <= node; j++) {
            if (map[i][j] == 1 && !visited[j]) {
                count++;
                dfs(j);
            }
        }
        
        return count;
    }
}