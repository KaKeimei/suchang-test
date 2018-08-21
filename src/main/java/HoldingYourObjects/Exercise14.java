package HoldingYourObjects;

import java.util.*;

/**
 * Created by suchang on 2018/08/18
 * Create an empty LinkedList<Integer>.
 * Using a Listlterator, add Integers to
 * the List by always inserting them in the middle of the List.
 */
public class Exercise14 {
	public void add(LinkedList<Integer> linkedList, Integer length) {
		ListIterator it = linkedList.listIterator((linkedList.size()/2));
		Random rand = new Random(47);
		Integer[] integers = new Integer[length];
		for (int i = 0; i < integers.length; i ++) {
			integers[i] = rand.nextInt(length);
		}
		for (Integer i : integers) {
			it.add(integers[i]);
		}
		System.out.println(linkedList);
	}
	public static void main(String[] args) {
		Exercise14 ex14 = new Exercise14();
		LinkedList<Integer> linkedList = new LinkedList<>();
		int length = 10;
		for (int i = 0; i < length; i ++) {
			ex14.add(linkedList, length);
		}
	}

}

