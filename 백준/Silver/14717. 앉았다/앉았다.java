import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numbers = br.readLine().split(" ");
        br.close();

        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);

        int total = 153;
        int count = 0;
        double result = 0.0;

        List<Integer> cards = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            cards.add(i);
            cards.add(i);
        }
        
        cards.remove(Integer.valueOf(num1));
        cards.remove(Integer.valueOf(num2));
           
        int younghak = getRank(num1, num2);
        
        for (int i = 0; i < cards.size(); i++) {
            for (int j = i + 1; j < cards.size(); j++) {
                int card1 = cards.get(i);
                int card2 = cards.get(j);
                
                int you = getRank(card1, card2);
                
                if (you < younghak) {
                    count++;
                }
            }
        }
        
        result = count / (total * 1.0);
        bw.write(String.format("%.3f", result));
        bw.flush();
        bw.close();
    }
    
    public static int getRank(int num1, int num2) {
        if (num1 == num2) { // 땡일 때
            return num1 + 100;
        }
        return (num1 + num2) % 10; // 끗일 때
    }
}