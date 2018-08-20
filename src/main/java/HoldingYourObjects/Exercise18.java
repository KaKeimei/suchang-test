package HoldingYourObjects;

import java.util.*;

/**
 * Created by suchang on 2018/08/19
 * Fill a HashMap with key-value pairs.
 * Print the results to show ordering by hash code.
 * Extract the pairs, sort by key, and place the result
 * into a LinkedHashMap. Show that the insertion order is maintained.
 */
public class Exercise18 {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(3,"A");
		map.put(1,"B");
		map.put(4,"C");
		map.put(2,"D");
		System.out.println(map);
		Set<Integer> sortintegers = new TreeSet<>(map.keySet());
		System.out.println(sortintegers);
		Map<Integer,String> linkedhashmap = new LinkedHashMap<>();
		for (Integer i : sortintegers) {
			linkedhashmap.put(i, map.get(i));
		}
		System.out.println(linkedhashmap);
	}
}
