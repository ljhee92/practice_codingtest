import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);

        StringBuilder sb = new StringBuilder();
        sb.append(calculateAverage(numbers)).append("\n")
        .append(calculateMid(numbers)).append("\n")
        .append(calculateFrequency(numbers)).append("\n")
        .append(calculateRange(numbers));

        System.out.print(sb);
    }

    private static int calculateAverage(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return (int) Math.round((double) total / numbers.length);
    }

    private static int calculateMid(int[] numbers) {
        return numbers[numbers.length/2];
    }

    private static int calculateFrequency(int[] numbers) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : numbers) {
            frequency.put(num, frequency.getOrDefault(num, 0)+1);
        }

        List<Integer> keySet = new ArrayList<>(frequency.keySet());
        keySet.sort((a, b) -> {
            int freqCompare = frequency.get(b).compareTo(frequency.get(a));
            if (freqCompare == 0) {
                return Integer.compare(a, b);
            }
            return freqCompare;
        });

        if (keySet.size() > 1 &&
            frequency.get(keySet.get(0)).equals(frequency.get(keySet.get(1)))) {
                return keySet.get(1);
            }

        return keySet.get(0);
    }

    private static int calculateRange(int[] numbers) {
        return numbers[numbers.length-1] - numbers[0];
    }
}
