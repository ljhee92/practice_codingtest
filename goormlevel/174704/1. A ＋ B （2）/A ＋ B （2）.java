import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] stringNumbers = br.readLine().split(" ");
		double[] numbers = new double[stringNumbers.length];
		double result = 0.000000;
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = Double.parseDouble(stringNumbers[i]);
			result += numbers[i];
		}
		
		System.out.printf("%.6f", result);
		
		br.close();
	}
}