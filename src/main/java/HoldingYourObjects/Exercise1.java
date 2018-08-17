package HoldingYourObjects;

import java.util.*;

/**
 * Created by suchang on 2018/08/17
 * Exercise 1: (2) Create a new class
 * called Gerbil with an int gerbilNumber
 * that’s initialized in the constructor.
 * Give it a method called hop( ) that
 * displays which gerbil number this is,
 * and that it’s hopping. Create an ArrayList
 * and add Gerbil objects to the List.
 * Now use the get( ) method to move
 * through the List and call hop( ) for each Gerbil.
 */
class Gerbil {
	private int gerbilNumber;
	Gerbil(int i) {
		gerbilNumber = i;
	}
	int hop() {
		System.out.print("hopping gerbilNumber is" + " ");
		return gerbilNumber;
	}
}
public class Exercise1 {
	public static void main(String[] args) {
		ArrayList<Gerbil> g = new ArrayList<>();
		for (int j = 0; j < 10; j++) {
			g.add(new Gerbil(j));
		}
		for (Integer i = 0 ; i < g.size(); i ++) {
			System.out.println(g.get(i).hop());
		}
	}
}
