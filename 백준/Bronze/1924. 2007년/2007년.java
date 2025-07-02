import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        List<String> weekend = List.of("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT");
        List<Integer> days = List.of(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
        
        int totalDays = 0;
        for (int i = 0; i < month - 1; i++) {
            totalDays += days.get(i);
        }
        totalDays += day;
        
        int index = totalDays % 7;
        
        System.out.println(weekend.get(index));
    }
}
