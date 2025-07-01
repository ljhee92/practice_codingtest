import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[9];
        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            numbers[i] = n;
        }
        
        List<Integer> sorted = Arrays.stream(numbers)
            .boxed()
            .collect(Collectors.toList());
        Collections.sort(sorted);
        int max = sorted.get(8);
        
        List<Integer> list = Arrays.stream(numbers)
            .boxed()
            .collect(Collectors.toList());
        
        System.out.println(max);
        System.out.println(list.indexOf(max) + 1);
    }
}