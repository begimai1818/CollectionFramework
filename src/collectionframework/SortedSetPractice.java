package collectionframework;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetPractice {
	public static void main(String[] args) {
		
		SortedSet<Integer> sSet = new TreeSet<>();
		sSet.add(123);
		sSet.add(1212);
		sSet.add(1233);
		sSet.add(124);
		sSet.add(12);
		System.out.println( sSet);
		System.out.println(sSet.subSet(122, 125));
		System.out.println(sSet.headSet(124));
		
		
		SortedSet<String> stSet = new TreeSet<>();
		stSet.add("aaa");
		stSet.add("bbb");
		stSet.add("ccc");
		stSet.add("oooo");
		stSet.add("aaaa");
		System.out.println(stSet);
		System.out.println(stSet.first());
		System.out.println(stSet.last());
		System.out.println(stSet.tailSet("ccc"));
		System.out.println(stSet.subSet("aaa", "ccc"));
		System.out.println(stSet.headSet("bbb"));
		
		
	}

}
