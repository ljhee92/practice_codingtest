import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < h; i++) {
            String line = br.readLine();
            int cloud = -1;

            for (int j = 0; j < w; j++) {
                if (line.charAt(j) == 'c') {
                    cloud = j;
                    sb.append("0 ");
                }

                if (line.charAt(j) == '.' && cloud == -1) {
                    sb.append("-1 ");
                }

                if (line.charAt(j) == '.' && cloud != -1) {
                    sb.append(j-cloud).append(" ");
                }
            }
            sb.append("\n");
        }
        
        System.out.print(sb.toString());
    }
}
