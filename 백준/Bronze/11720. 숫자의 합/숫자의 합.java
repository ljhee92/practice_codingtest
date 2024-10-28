import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        String numberString = scanner.next();
        char[] numbers = numberString.toCharArray();
        int result = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i] - '0';
        }
        
        System.out.println(result);
    }
}