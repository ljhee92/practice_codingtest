import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] rectangular = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < M; j++) {
				rectangular[i][j] = Character.getNumericValue(line.charAt(j));
			} 
		}
		
		int answer = getSquareArea(Math.min(N, M), N, M, rectangular);
		
		bw.write(answer + "\n");
		bw.flush();
		bw.close();
	}
	
	public static int getSquareArea(int min, int N, int M, int[][] rectangular) {
		int answer = 1;
		for (int size = 2; size <= min; size++) {
			for (int i = 0; i <= N - size; i++) {
				 for (int j = 0; j <= M - size; j++) {
					 if (rectangular[i][j] == rectangular[i][j+(size-1)] &&
					 rectangular[i][j+(size-1)] == rectangular[i+(size-1)][j] &&
					 rectangular[i+(size-1)][j] == rectangular[i+(size-1)][j+(size-1)]) {
						 answer = size * size;
					 }
				 }
			}
		}
		return answer;
	}
}