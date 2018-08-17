package HoldingYourObjects;
import java.util.*;

/**
 * Created by suchang on 2018/08/17
 * Exercise 7: (3) Create a class,
 * then make an initialized array of objects
 * of your class. Fill a List from your array.
 * Create a subset of your List by using subList( ),
 * then remove this subset from your List.
 */
class Initialize {
	private int index;
	Initialize(int i) {
		index = i;
		System.out.print("Constructing with index " + index + " ");
	}
}

public class Exercise7 {
	public static void main(String[] args) {
		Initialize[] initialize = new Initialize[5];
		for (int i = 0; i < 5; i ++) {
			initialize[i] = new Initialize(i);
		}
		System.out.println();
		List<Initialize> list = new ArrayList<Initialize>();
		for (Initialize in : initialize) {
			list.addAll(list);
		}
		System.out.println("list constructed using Initialize " + list);
		List<Initialize> sublist = list.subList(1,4);
		list.remove(sublist);
		System.out.println("removed " + list);
	}
}
