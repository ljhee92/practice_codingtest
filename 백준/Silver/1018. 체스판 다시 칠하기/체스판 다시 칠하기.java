import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[][] board = new String[N][M];
        
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                if (line.charAt(j) == 'W') {
                    board[i][j] = "W";
                } else {
                    board[i][j] = "B";
                }
            }
        }
        
        br.close();
        
        int result = 64;
        
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                result = Math.min(result, calculateMin(i, j, board));
            }
        }
        
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
    
    public static int calculateMin(int startRow, int startCol, String[][] board) {
        int count = 0;
        String color = "W";
        
        for (int i = startRow; i < startRow + 8; i++) {
            for (int j = startCol; j < startCol + 8; j++) {
                if (!board[i][j].equals(color)) {
                    count++;
                }
                
                if (color.equals("W")) {
                    color = "B";
                } else {
                    color = "W";
                }
            }
            
            if (color.equals("W")) {
                color = "B";
            } else {
                color = "W";
            }
        }
        
        return Math.min(count, 64 - count);
    }
}