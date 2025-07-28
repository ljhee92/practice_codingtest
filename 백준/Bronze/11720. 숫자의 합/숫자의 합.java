import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] numbers = br.readLine().split("");
        int answer = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
            answer += arr[i];
        }
        System.out.println(answer);        
    }
}
