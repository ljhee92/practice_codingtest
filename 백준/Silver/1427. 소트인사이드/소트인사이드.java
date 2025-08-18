import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        Integer[] numbers = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(numbers, Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int num : numbers) {
            sb.append(num);
        }
        System.out.println(sb);
    }
}
