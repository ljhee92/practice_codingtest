import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = new String[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = br.readLine();
        }

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);
        int first = a + b - c;

        int aAndB = Integer.parseInt(numbers[0] + numbers[1]);
        int second = aAndB - c;

        System.out.println(first);
        System.out.println(second);
    }
}
