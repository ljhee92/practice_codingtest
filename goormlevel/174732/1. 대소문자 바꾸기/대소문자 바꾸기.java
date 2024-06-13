import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String word = br.readLine();
		char[] characters = word.toCharArray();
		
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < length; i++) {
			if(Character.isUpperCase(characters[i])) {
				result.append(String.valueOf(characters[i]).toLowerCase());
			} else {
				result.append(String.valueOf(characters[i]).toUpperCase());
			}
		}
		System.out.println(result.toString());
	}
}