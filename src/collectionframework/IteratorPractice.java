package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(21);
		nums.add(32);
		nums.add(433);
		nums.add(54);
		Iterator<Integer> iter = nums.iterator();
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		iter.remove();
		System.out.println(nums);

		// ITERATING OVER THE COLLECTIONS WITH while LOOP and REMOVING ITEM

		// while(iter.hasNext()) {
		// if(iter.next()>100)
		// iter.remove();
		// System.out.println(iter.next() );
		// }
		// ITERATING OVER THE COLLECTIONS WITH FOR LOOP and REMOVING ITEM
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) > 100) {
				nums.remove(nums.get(i));

			}
		}
		// WE CANNOT REMOVE ITEMS FROM COLLECTION WHILE ITERATING OVER USING FOR EACH
		// LOOP
		// for (Integer items : nums) {
		// if(items>100) {
		// nums.remove(nums);
		// }
		// }
		System.out.println(nums);
	}

}
