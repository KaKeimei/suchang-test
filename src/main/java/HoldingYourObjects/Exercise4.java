package HoldingYourObjects;

import java.util.*;

/**
 * Created by suchang on 2018/08/17
 * Exercise 4: (3) Create a generator
 * class that produces character names
 * (as String objects) from your favorite
 * movie (you can use Snow White or Star Wars
 * as a fallback) each time you call next( ),
 * and loops around to the beginning of the
 * character list when it runs out of names.
 * Use this generator to fill an array,
 * an ArrayList, a LinkedList, a HashSet,
 * a LinkedHashSet, and a TreeSet,
 * then print each container.
 */
class Generator {
	String[] movies = {"A", "B", "C", "D", "E", "F", "G", "H"};
	int index = 0;
	public String next() {
		if (index < (movies.length)) {
			return movies[index ++];
		} else {
			index = 0;
			return movies[0];
		}
	}
}

public class Exercise4 {
	public static void main(String[] args) {
		Generator ge = new Generator();
		ArrayList<String> a = new ArrayList<>();
		LinkedList<String> l = new LinkedList<>();
		HashSet<String> h = new HashSet<>();
		LinkedHashSet<String> ls = new LinkedHashSet<>();
		TreeSet<String> t = new TreeSet<>();
		for (int j = 0; j < ge.movies.length; j ++) {
			a.add(ge.next());
			l.add(ge.next());
			h.add(ge.next());
			ls.add(ge.next());
			t.add(ge.next());
		}
		System.out.println(ge.movies.toString());
		System.out.println(a);
		System.out.println(l);
		System.out.println(h);
		System.out.println(ls);
		System.out.println(t);
	}
}
