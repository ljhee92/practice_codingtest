import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int asset = Integer.parseInt(br.readLine());

        int[] stocks = new int[14];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 14; i++) {
            stocks[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        int bnp = calculateBnp(asset, stocks);
        int timing = calculateTiming(asset, stocks);

        String result = "SAMESAME";

        if (bnp > timing) {
            result = "BNP";
        } else if (bnp < timing) {
            result = "TIMING";
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

    public static int calculateBnp(int asset, int[] stocks) {
        int cash = asset;
        int quantity = 0;

        for (int i = 0; i < 14; i++) {
            if (stocks[i] <= cash) {
                quantity += cash / stocks[i];
                cash -= stocks[i] * (cash / stocks[i]);
            }
        }

        return cash + (stocks[13] * quantity);
    }

    public static int calculateTiming(int asset, int[] stocks) {
        int cash = asset;
        int quantity = 0;

        for (int i = 0; i < 10; i++) {
            int[] arr = new int[4];
            for (int j = 0; j < 4; j++) {
                arr[j] = stocks[i+j];
            }

            if (arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3]) {
                cash += quantity * stocks[i+3];
                quantity = 0;
            } else if (arr[0] > arr[1] && arr[1] > arr[2] && arr[2] > arr[3]
                    && cash >= stocks[i+3]) {
                quantity += cash / stocks[i+3];
                cash -= stocks[i+3] * (cash / stocks[i+3]);
            }
        }

        return cash + (stocks[13] * quantity);
    }
}