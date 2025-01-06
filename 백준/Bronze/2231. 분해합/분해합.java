import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String nStr = br.readLine();
		int n = Integer.parseInt(nStr);
		int start = n - (nStr.length() * 9);
		int m = 0;
		
		for (int i = start; i <= n; i++) {
			int sum = 0; 
			int number = i;
			
			while (number != 0) {
				sum += number % 10;
				number /= 10;
			}
			
			if (i + sum == n) {
				m = i;
				break;
			}
		}
		
		bw.write(m + "\n");
		bw.flush();
		bw.close();
	}
}