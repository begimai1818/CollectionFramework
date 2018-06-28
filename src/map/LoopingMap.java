package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoopingMap {

	public static void main(String[] args) {
	
		Map<String,String> jobMap = new HashMap<>();
		
		jobMap.put("SDET", "Vienna");
		jobMap.put("MannualTester", "Fairfax");
		jobMap.put("DBA", "Herndon");
		jobMap.put("ScrumMaster", "Reston");
		jobMap.put("ProductOwner", "Fairfax");
		jobMap.put("ScrumMaster", "DC");
		
		System.out.println( jobMap);
		
		Set<String> keys = jobMap.keySet();
		for (String key : keys) {
			System.out.println( key );
			
			
		}
		//use Iterator loop through the sets
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() + " ");
		}
		
		keys.remove("ProductOwner");
		System.out.println( jobMap);
		
		//get all the values
		Collection<String> allValues = jobMap.values();	
		Iterator<String> it2 = allValues.iterator();
		while(it2.hasNext()) {//if there is no index we cannot use for loop
			System.out.println(it2.next() + " ");
		}
		allValues.remove("Fairfax");
		System.out.println( jobMap);
		
		
		

	}

}
