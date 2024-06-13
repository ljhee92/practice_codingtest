import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int cnt = Integer.parseInt(input);
		
		for(int i = 0; i < cnt; i++) {
			for(int j = cnt; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}