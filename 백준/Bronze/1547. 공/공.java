import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int times = Integer.parseInt(br.readLine());
        int[] cups = {1, 2, 3};
        
        for (int i = 0; i < times; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            int temp = cups[x-1];
            cups[x-1] = cups[y-1];
            cups[y-1] = temp;
        }
        br.close();
        
        List<Integer> list = Arrays.stream(cups).boxed().collect(Collectors.toList());
        int result = list.indexOf(1) + 1;
        
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}