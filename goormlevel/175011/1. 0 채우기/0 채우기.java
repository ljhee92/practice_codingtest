import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
		
		String size = br.readLine();
		int sizeNumber = Integer.parseInt(size);
			
		String lineNumbersStr = "";
		List<String> list = new ArrayList<>();
			
		for(int i = 0; i < sizeNumber; i++) {
			lineNumbersStr = br.readLine();
			list.add(lineNumbersStr);
		}
			
		String[] lineNumbersArray = new String[sizeNumber];
		Map<Integer, String> innerMap = null;
		Map<Integer, Map<Integer, String>> map = new HashMap<>();
			
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < list.size(); i++) {
			lineNumbersArray = list.get(i).split(" ");
			innerMap = new HashMap<>();
			for(int j = 0; j < lineNumbersArray.length; j++) {
				innerMap.put(j+1, lineNumbersArray[j]);
				if("0".equals(lineNumbersArray[j])) {
					x = i+1;
					y = j+1;
				}
			}
			map.put(i+1, innerMap);
		}
			
		int result = 0;
		Map<Integer, String> innerMap2 = map.get(x);
			
		for(int i = 0; i < innerMap2.size(); i++) {
			result += Integer.parseInt(innerMap2.get(i+1));
		}
			
		for(int i = 0; i < map.size(); i++) {
			result += Integer.parseInt(map.get(i+1).get(y));
		}
		
		System.out.println(result);
		}
	}
}