

import java.util.Map;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		map.put(1, 5);
		map.put(3, 4);
		map.put(2, 0);
		
		System.out.println(map);
	}
	
}