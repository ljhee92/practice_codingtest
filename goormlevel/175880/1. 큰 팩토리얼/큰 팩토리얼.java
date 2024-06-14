import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String input = br.readLine();
			int numbers = Integer.parseInt(input);
			long result = 1;
			
			for(int i = 1; i <= numbers; i++) {
				result *= i;
				result %= 1000000007;
			}
			
			System.out.println(result);
		}
	}
}