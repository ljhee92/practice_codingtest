import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String input = br.readLine();
			String[] strArray = input.split(" ");
			int result = 0;
			
			for(int i = 0; i < strArray.length; i++) {
				result += Integer.parseInt(strArray[i]);
			}
			
			System.out.println(result);
		}
	}
}