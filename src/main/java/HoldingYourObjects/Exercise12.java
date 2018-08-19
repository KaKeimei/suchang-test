package HoldingYourObjects;

import javafx.beans.binding.When;
import jdk.nashorn.internal.ir.WhileNode;

import java.util.*;

/**
 * Created by suchang on 2018/08/18
 * Create and populate a List<Integer>.
 * Create a second List<Integer> of the same size
 * as the first, and use ListIterators to read elements
 * from the first List and insert them into the second
 * in reverse order. (You may want to explore
 * a number of different ways to solve this problem.)
 */
public class Exercise12 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> list2 = new LinkedList<>(Arrays.asList(10,9,8,7,6));
		ListIterator it = list1.listIterator(5);
		while (it.hasPrevious()) {
			list2.add((Integer) it.previous());
		}
		System.out.println(list2);
	}

}
