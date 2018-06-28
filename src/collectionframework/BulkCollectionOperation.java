package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class BulkCollectionOperation {

	public static void main(String[] args) {
		Collection<String> ls1 = new ArrayList<>();
		ls1.add("java");
		ls1.add("selenium");
		System.out.println(ls1);
		Collection<String> ls2 = Arrays.asList("java", "ruby", "c++", "maven");
		System.out.println(ls2);
		ls1.addAll(ls2);
		System.out.println(ls1);
		Collection<String> ls3 = Arrays.asList("c++", "maven");
		ls1.removeAll(ls3);
		System.out.println(ls1);
		Collection<String> ls4 = Arrays.asList("selenium");
		ls1.retainAll(ls4);
		System.out.println(ls1);

	}

}
