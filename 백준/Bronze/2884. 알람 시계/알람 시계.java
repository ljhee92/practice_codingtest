import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if (minute < 45) {
            if (hour == 0) {
                hour = 24;
            }
            hour -= 1;
            minute += 15;
        } else { // minute >= 45
            minute -= 45;
        }

        System.out.println(hour + " " + minute);
    }
}
