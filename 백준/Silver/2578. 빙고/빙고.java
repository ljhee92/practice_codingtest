import java.io.*;
import java.util.*;

public class Main {
    static int[][] binggo;
    static int count;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        binggo = new int[5][5];
        count = 0;
        
        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            for (int j = 0; j < 5; j++) {
                binggo[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            for (int j = 0; j < 5; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
        }
        
        br.close();
        
        for (int i = 0; i < list.size(); i++) {
            int target = list.get(i);
            
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (binggo[j][k] == target) {
                        binggo[j][k] = 0;
                    }
                }
            }
            
            checkWidth();
            checkLength();
            checkLeftToRight();
            checkRightToLeft();
            
            if (count >= 3) {
                bw.write((i+1) + "\n");
                bw.flush();
                bw.close();
                break;
            }
            count = 0;
        }
    }
    
    public static void checkWidth() {
        for (int i = 0; i < 5; i++) {
            int width = 0;
            
            for (int j = 0; j < 5; j++) {
                if (binggo[i][j] == 0) {
                    width++;
                }
            }
            
            if (width == 5) {
                count++;
            }
        }
    }
    
    public static void checkLength() {
        for (int i = 0; i < 5; i++) {
            int length = 0;
            
            for (int j = 0; j < 5; j++) {
                if (binggo[j][i] == 0) {
                    length++;
                }
            }
            
            if (length == 5) {
                count++;
            }
        }
    }
    
    public static void checkLeftToRight() {
        int leftToRight = 0;
        for (int i = 0; i < 5; i++) {
            if (binggo[i][i] == 0) {
                leftToRight++;
            }
        }
        
        if (leftToRight == 5) {
            count++;
        }
    }
    
    public static void checkRightToLeft() {
        int rightToLeft = 0;
        for (int i = 0; i < 5; i++) {
            if (binggo[i][4-i] == 0) {
                rightToLeft++;
            }
        }
        
        if (rightToLeft == 5) {
            count++;
        }
    }
} 