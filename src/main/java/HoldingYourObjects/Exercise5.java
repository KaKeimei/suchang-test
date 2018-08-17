package HoldingYourObjects;

import java.util.*;

/**
 * Created by suchang on 2018/08/17
 * Exercise 5: (3) Modify ListFeatures.java
 * so that it uses Integers (remember autoboxing!)
 * instead of Pets, and explain any difference in results.
 */
public class Exercise5 {
	public static List<Integer> returnlist(int amp, int times) {
		Random rand = new Random();
		List<Integer> in = new ArrayList<>();
		for (int i = 0; i < times; i ++) {
			in.add(rand.nextInt(amp));
		}
		return in;
	}
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Integer> i1 = returnlist(20,7);
		System.out.println("1: " + i1);
		Integer i2 = new Integer(rand.nextInt(30));
		i1.add(i2);
		System.out.println("2: " + i1);
		System.out.println("3: " + i1.contains(i2));
		i1.remove(i2);
		Integer i = i1.get(2);
		System.out.println("4: " + i + i1.indexOf(i));
		Integer ii = new Integer(rand.nextInt(30));
		System.out.println("5: " + i1.indexOf(ii));
		System.out.println("6: " + i1.remove(ii));
		System.out.println("7: " + i1.remove(i));
		System.out.println("8: " + i1);
		i1.add(3, new Integer(rand.nextInt(30)));
		System.out.println("9: " + i1);
		List<Integer> sub= i1.subList(1, 4);
		System.out.println("sublist: " + sub);
		System.out.println("10: " + i1.containsAll(sub));
		Collections.sort(sub);
		System.out.println("Sorted subList " + sub);
		System.out.println("11: " + i1.containsAll(sub));
		Collections.shuffle(sub, rand);
		System.out.println("12: " + i1.containsAll(sub));
		List<Integer> copy = new ArrayList<>(i1);
		sub = Arrays.asList(i1.get(1), i1.get(4));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<Integer>(i1);
		copy.remove(2);
		System.out.println("14: " + copy);
		copy.removeAll(sub);
		System.out.println("15: " + copy);
		copy.set(1, new Integer(rand.nextInt(30)));
		System.out.println("16: " + copy);
		copy.addAll(2, sub);
		System.out.println("17: " + copy);
		System.out.println("18: " + i1.isEmpty());
		i1.clear();
		System.out.println("19: " + i1);
		System.out.println("20: " + i1.isEmpty());
		i1.addAll(returnlist(30,4));
		System.out.println("21: " + i1);
		Object[] o = i1.toArray();
		System.out.println("22: " + o[3]);
		Integer[] pa = i1.toArray(new Integer[0]);
		System.out.println("23: " + pa[3]);

	}
}
