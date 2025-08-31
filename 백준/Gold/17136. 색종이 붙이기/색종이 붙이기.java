import java.io.*;
import java.util.*;

public class Main {
    
    static int[][] map = new int[10][10];
    static int[] color = new int[]{5, 5, 5, 5, 5};
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0, 0);
        if (answer == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }

    static void dfs(int x, int y, int used) {
        if (x == 10) {
            answer = Math.min(answer, used);
            return;
        }
        
        if (y == 10) {
            dfs(x+1, 0, used);
            return;
        }

        if (map[x][y] == 0) {
            dfs(x, y+1, used);
        }

        if (map[x][y] == 1) {
            // 붙이는 게 가능하면 -> 가능한 걸 어떻게 확인? 메서드로
            // 붙이는 것도 메서드로 -> map[x][y] = 0, color[?] = color[?]-1;
            for (int i = 5; i > 0; i--) {
                if (canAttatch(x, y, i) && color[i-1] > 0) {
                    attatch(x, y, i, 0);
                    color[i-1]--;
                    dfs(x, y+1, used+1);
                    color[i-1]++;
                    attatch(x, y, i, 1);    
                }
            }
        }
    }

    static boolean canAttatch(int x, int y, int size) {
        if (x+size > 10 || y+size > 10) {
            return false;
        }

        int count = 0;
        for (int i = x; i < x+size; i++) {
            for (int j = y; j < y+size; j++) {
                if (map[i][j] == 1) {
                    count++;
                }
            }
        }

        if (count == size * size) {
            return true;
        }
        return false;
    }

    static void attatch(int x, int y, int size, int value) {
        for (int i = x; i < x+size; i++) {
            for (int j = y; j < y+size; j++) {
                map[i][j] = value;
            }
        }
    }
}
