package HoldingYourObjects;

import java.util.*;

/**
 * Created by suchang on 2018/08/17
 * Exercise 2: (1) Modify SimpleCollection.java
 * to use a Set for c.
 */
public class Exercise2 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < 10; i ++) {
			set.add(i);
		}
		for (Integer i : set) {
			System.out.print(i + ", ");
		}
	}
}
