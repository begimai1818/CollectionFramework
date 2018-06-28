package map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "abc");
		map.put(2, "def");
		map.put(3, "ccc");
		
		System.out.println(map);
		
		//getting items  by key
		System.out.println(map.get(2) );
		System.out.println( map.get(17) );
		
		//cheking a key exists in a map
		System.out.println( map.containsKey(17) );
		
		System.out.println( map.containsValue("ccc"));
		
		
		//counting the items in a map object
		System.out.println( " counting map items : " + map.size());
		
		//cheking if it is empty or not
		System.out.println( map.isEmpty() );
		
		
		//remove items
		System.out.println( map.remove(2) );
		
		//replace a map value using key
		System.out.println( map.replace(3, "cool") );
		
		
		//replace a map value using both key and value
		System.out.println( map.replace(1, "abc", "sweeeet"));
		
		//get and item and if the key doesn't exist return default value
		String str1 = map.getOrDefault(17, "albeni");
		String str2 = map.getOrDefault(1, "bounty");
		
		
		
		//adding an item while cheking if the key exist or not
		if(!map.containsKey(3))
		map.put(3, "something else");
		
		map.putIfAbsent(5, "somethingggggg");//check if we have it! if we don't it will put it
		
		
		
		
		System.out.println(map);
		
		
		
		
		

	}

}
