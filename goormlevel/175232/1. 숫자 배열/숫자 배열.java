import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String input = br.readLine();
			int num = Integer.parseInt(input);
			int cnt = 0;
			
			for(int i = 0; i < num; i++) {
				for(int j = 0; j < num; j++) {
					System.out.print(++cnt);
					if(j != num-1) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}