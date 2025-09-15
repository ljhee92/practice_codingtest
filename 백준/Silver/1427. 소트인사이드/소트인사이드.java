import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        String[] numbers = number.split("");
        Arrays.sort(numbers, Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String num : numbers) {
            sb.append(num);
        }
        System.out.println(sb);
    }
}
