import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int remainder = num2 % 10;
        int num3 = num1 * remainder;
        System.out.println(num3);
        
        int share = num2 / 10;
        remainder = share % 10;
        int num4 = num1 * remainder;
        System.out.println(num4);
        
        share = share / 10;
        remainder = share % 10;
        int num5 = num1 * remainder;
        System.out.println(num5);
        
        System.out.println(num3 + num4 * 10 + num5 * 100);
    }
}