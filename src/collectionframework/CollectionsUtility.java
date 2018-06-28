package collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUtility {
	public static void main(String[] args) {
		
		//Collections is a class from java.util  package for common operation
		//Collection is an interface which define common behavior
		//Map does not extend Collection interface because it's key value pair
		//Java Collection framework included All Collection interface sub classes and Map interface
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(2);
		arr.add(1);
		arr.add(3);
		arr.add(3);
		arr.add(3);
		arr.add(-1);
		Collections.sort(arr);
		Collections.shuffle(arr);
		System.out.println(arr);
		int freq = Collections.binarySearch(arr, 3);
		System.out.println(freq);
		
		
		
	}

}
