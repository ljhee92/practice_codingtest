import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        List<Integer> heights = new ArrayList<Integer>();
        int sum = 0;
        
        for (int i = 0; i < 9; i++) {
            heights.add(Integer.parseInt(br.readLine()));
            sum += heights.get(i);
        }
        br.close();
        
        boolean found = false;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - heights.get(i) - heights.get(j) == 100) {
                    heights.remove(j);
                    heights.remove(i);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        
        Collections.sort(heights);
        for (int height : heights) {
            bw.write(height + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}