package HoldingYourObjects;

import java.util.*;

/**
 * Created by suchang on 2018/08/18
 * Write a method that uses an Iterator
 * to step through a Collection and print
 * the toString( ) of each object in the container.
 * Fill all the different types of Collections
 * with objects and apply your method to each container.
 */
public class Exercise11 {
	public static void print(Collection c) {
		Iterator it = c.iterator();
		while (it.hasNext()) {
			System.out.print(it.next().toString() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		print(arrayList);
		LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(2,3,4,5,6));
		print(linkedList);
		HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(3,4,5,6,7));
		print(hashSet);
		TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(4,5,6,7,8));
		print(treeSet);
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(5,6,7,8,9));
		print(linkedHashSet);
	}
}
