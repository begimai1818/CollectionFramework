package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MapDay {
	public static void main(String[] args) {
		
		/*Create a list of prices(long)
		 * with few duplicate elements 
		 * Task 1
		 * GENERATE ONLY UNIQUE	prices by taking out duplicate
		 * 
		 * Task 2
		 * Generate ordered collection out of the list
		 * 
		 * Task 3
		 * retrieve the items from 5-9
		 * assuming you have 5 and 9 in the list
		 * 1,2,,3,4,5,7,9-->>5,6,8,9
		 * 
		 */
	
		List<Long> longList = new ArrayList<>();
		longList.add(100L);
		longList.add(200L);
		longList.add(500L);
		longList.add(200L);
		longList.add(500L);
		longList.add(400L);
		longList.add(300L);
		
		System.out.println(longList);
//		Set<Long> longSet = new HashSet<>(longList);
		//Collections.sort(longList);
		Set<Long> longSet = new HashSet<>();
		for (Long each : longList) {
			longSet.add(each);
			
		}
		
//		Collections.shuffle(longList);
		System.out.println(longList);
		
		SortedSet<Long> sSet = new TreeSet<>(longSet);
		System.out.println(sSet);
		
		System.out.println( sSet.subSet(200L, 400L));
		System.out.println( sSet.tailSet(300L));
		System.out.println( sSet.headSet(300L));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
