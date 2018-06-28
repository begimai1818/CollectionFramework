package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListImplementations {

	public static void main(String[] args) {

		Collection<Integer> items = new ArrayList<>();
		System.out.println(items.isEmpty());
		items.add(3);
		items.add(4);
		items.add(7);
		items.add(5);

		List<Integer> list1 = Arrays.asList(66, 55, 44, 33, 77);
		items.addAll(list1);
		System.out.println(items);
		items.removeAll(list1);
		System.out.println(items);

		List<Integer> list2 = Arrays.asList(33, 77);
		items.retainAll(list2);
		System.out.println(items);

		Collection<String> ls = new ArrayList<>();
		ls.add("abc");
		ls.add("def");
		ls.add("ghe");
		ls.add("ccc");

		Collection<String> ls1 = new ArrayList<>();
		ls1.addAll(ls);
		System.out.println(ls1.toString());

		Collection<String> ls2 = Arrays.asList("aa", "bb");

		ls2.remove(ls1);
		System.out.println();
		ls1.removeAll(ls2);

	}

	// List<Integer> list = new ArrayList<>();
	// list.add(3);
	// list.add(4);
	// list.add(7);
	// list.add(5);
	// list.add(9);
	// list.remove(1);
	// list.remove(1);

	// list.remove(new Integer(1) );
	// System.out.println(list);
	//
	// for (int i = 0; i < list.size(); i++) {
	// System.out.println("");
	//
	// }

}
