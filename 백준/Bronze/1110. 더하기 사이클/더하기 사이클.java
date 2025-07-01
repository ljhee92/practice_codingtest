import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        int num = Integer.parseInt(number);
        int cycle = 1;
        
        int newNum = calculate(number);
        while (newNum != num) {
            newNum = calculate(String.valueOf(newNum));
            cycle++;
        }
        System.out.println(cycle);
    }
    
    private static int calculate(String number) {
        int first = 0;
        int last = 0;
        if (number.length() > 1) {
            char firstChar = number.charAt(0);
            char lastChar = number.charAt(1);
            first = Character.getNumericValue(firstChar);
            last = Character.getNumericValue(lastChar);
        } else {
            char lastChar = number.charAt(0);
            last = Character.getNumericValue(lastChar);
        }
        int plus = first + last;
        int lastOfPlus = plus % 10;
        return last * 10 + lastOfPlus;
    }
}