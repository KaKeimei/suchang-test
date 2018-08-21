package HoldingYourObjects;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by suchang on 2018/08/18
 * Modify innerclasses/Sequence.java
 * so that Sequence works with an Iterator instead of a Selector.
 */
public class Exercise9 {
	private Object[] items;
	private int next = 0;
	public Exercise9(int size) {
		items = new Object[size];
	}
	public void add(Object x) {
		if(next < items.length) {
			items[next++] = x;
		}
	}
	public Object current() {
		return items[next];
	}

	public static void main(String[] args) {
		Exercise9 ex9 = new Exercise9(10);
		for(int i = 0; i < 10; i++) {
			ex9.add(Integer.toString(i));
		}
		Iterator<Object> it = Arrays.asList(ex9.items).iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
