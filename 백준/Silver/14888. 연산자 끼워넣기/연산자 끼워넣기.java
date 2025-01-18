import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] numbers;
    static int[] delimiters;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        delimiters = new int[4];

        for (int i = 0; i < 4; i++) {
            delimiters[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        calculate(numbers[0], 1);
        bw.write(max + "\n");
        bw.write(min + "\n");
        bw.flush();
        bw.close();
    }

    private static void calculate(int number, int index) {
        if (index == N) {
            min = Math.min(min, number);
            max = Math.max(max, number);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (delimiters[i] > 0) {
                delimiters[i]--;

                switch (i) {
                    case 0:
                        calculate(number + numbers[index], index + 1);
                        break;
                    case 1:
                        calculate(number - numbers[index], index + 1);
                        break;
                    case 2:
                        calculate(number * numbers[index], index + 1);
                        break;
                    case 3:
                        calculate(number / numbers[index], index + 1);
                        break;
                }

                delimiters[i]++;
            }
        }
    }
}