package apnaCollege_placementCourse;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	public static void main(String args[]) {
		// Creating
		HashSet<Integer> set = new HashSet<>();
		
		// Insert
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		// Search - contains
		System.out.println((set.contains(1))?"set contains 1":"set does not contain 1");
		
		// Delete - remove
		set.remove(1);
		System.out.println((set.contains(1))?"set contains 1":"set does not contain 1");
		
		// Size
		System.out.println("Size of set is : " + set.size());
		
		// Iterator
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		System.out.println(set.toString());
	}
}
