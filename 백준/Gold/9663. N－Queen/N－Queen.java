import java.io.*;

public class Main {
    
    static int n;
    static int[][] arr;
    static int count = 0;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        dfs(0);
        System.out.println(count);
    }
    
    static void dfs(int row) {
        if (row == n) {
            count++;
            return;
        }
        
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col)) {
                arr[row][col] = 1;
                dfs(row+1);
                arr[row][col] = 0;
            }
        }
    }
    
    static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (arr[i][col] == 1) {
                return false;
            }
        }
        
        for (int i = 1; row-i >= 0 && col-i >= 0; i++) {
            if (arr[row-i][col-i] == 1) {
                return false;
            } 
        }
        
        for (int i = 1; row-i >= 0 && col+i < n; i++) {
            if (arr[row-i][col+i] == 1) {
                return false;
            }
        }
        
        return true;
    }
}
