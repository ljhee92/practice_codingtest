import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		
		// 테스트 케이스의 수 만큼 입력 받기
		List<String> list = new ArrayList<>();
		for(int i = 0; i < cnt; i++) {
			list.add(br.readLine());
		}
		
		// 리스트의 요소들에서 x, y, n 구해내기
		for(String s : list) {
			Map<String, String> map = new HashMap<>();
			String[] strs = s.split(" ");
			
			map.put("x", strs[0]);
			map.put("y", strs[1]);
			map.put("n", strs[2]);
			
			int path = Math.abs(Integer.parseInt(map.get("x"))) + Math.abs(Integer.parseInt(map.get("y")));
			int n = Integer.parseInt(map.get("n"));
			
			String result = "NO";
			if(path <= n && ((path - n) % 2 == 0)) {
				result = "YES";
			}
			System.out.println(result);
		}
	}
}