import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Double> grades = Map.of("A+", 4.5,
                                           "A0", 4.0,
                                           "B+", 3.5,
                                           "B0", 3.0,
                                           "C+", 2.5,
                                           "C0", 2.0,
                                           "D+", 1.5,
                                           "D0", 1.0,
                                           "F", 0.0);
        
        double units = 0.0;
        double total = 0.0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double unit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            
            if (grade.equals("P")) {
                continue;
            }
            
            units += unit;
            total += unit * grades.get(grade);
        }
        
        System.out.println(total / units);
    }
}
