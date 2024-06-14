import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int inputNumber = Integer.parseInt(input);
		int[] coins = {40, 20, 10, 5, 1};
		int cnt = 0;
		
		for(int i : coins) {
			if(inputNumber >= i) {
				cnt += inputNumber / i;
				inputNumber %= i;
			} else {
				continue;
			}
		}
		
		System.out.println(cnt);
	}
}