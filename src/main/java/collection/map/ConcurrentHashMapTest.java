package collection.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
	
	public static void main(String arr[]) {
		
		Map<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();
		concurrentHashMap.put("1", "Imran Khan");
		concurrentHashMap.put("2", "Vinay Kumar");
		concurrentHashMap.put("3", "Rahul Kumar");
		System.out.println(concurrentHashMap.get("2"));
	}

}
