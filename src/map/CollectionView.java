package map;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionView {
	public static void main(String[] args) {
		
		List<Long> longList = new ArrayList<>();
		longList.add(100L);
		longList.add(200L);
		longList.add(500L);
		longList.add(200L);
		longList.add(500L);
		longList.add(400L);
		longList.add(300L);
		
		SortedSet<Long> sSet = new TreeSet<>(longList);
		System.out.println(sSet);
		
		SortedSet<Long> tail = sSet.tailSet(300L);
		System.out.println(tail);
		tail.remove(200L);
		System.out.println( sSet);
		System.out.println(tail);
		
		
	}

}
