import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String input = br.readLine();
			String[] strArray = input.split("");
			
			System.out.println(strArray.length);
		}
	}
}