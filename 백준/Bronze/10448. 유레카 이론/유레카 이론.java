import java.io.*;

public class Main {
	public static int[] arr = new int[45];
	
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 45; i++) {
			arr[i] = (i + 1) * (i + 2) / 2;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int times = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < times; i++) {
			bw.write(result(Integer.parseInt(br.readLine())) + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static int result(int number) {
		for (int i = 0; i < 45; i++) {
			for (int j = i; j < 45; j++) {
				for (int k = j; k < 45; k++) {
					if (arr[i] + arr[j] + arr[k] == number) {
						return 1;
					}
				}
			}
		}
		return 0;
	}
}