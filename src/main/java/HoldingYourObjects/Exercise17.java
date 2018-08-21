package HoldingYourObjects;

import java.util.*;

/**
 * Created by suchang on 2018/08/19
 * Take the Gerbil class in Exercise 1
 * and put it into a Map instead, associating each Gerbil’s name
 * (e.g. "Fuzzy" or "Spot") as a String (the key) for each Gerbil
 * (the value) you put in the table. Get an Iterator for the keySet( )
 * and use it to move through the Map, looking up the Gerbil for
 * each key and printing out the key and telling the Gerbil to hop( ).
 */
public class Exercise17 {
	static String[] gerbilname = {"Fuzzy", "Spot", "Sara", "Uncle", "Sam", "July", "Father"};
	public static void main(String[] args) {
		HashMap<String,Gerbil> map = new HashMap<>();
		for (int i = 0; i < 7; i ++) {
			map.put(gerbilname[i], new Gerbil(i));
		}
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(s + " @");
			System.out.println(map.get(s).hop());
		}
	}
}