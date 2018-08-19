package HoldingYourObjects;
import java.util.*;

/**
 * Created by suchang on 2018/08/18
 * Modify Exercise l so it uses an Iterator
 * to move through the List while calling hop( ).
 */
class Gerbil1 {
	private int gerbilNumber;
	Gerbil1(int i) {
		gerbilNumber = i;
	}
	int hop() {
		System.out.print("hopping gerbilNumber1 is" + " ");
		return gerbilNumber;
	}
}
public class Exercise8 {
	public static void main(String[] args) {
		ArrayList<Gerbil1> g = new ArrayList<>();
		for (int j = 0; j < 10; j++) {
			g.add(new Gerbil1(j));
		}
		Iterator<Gerbil1> it = g.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().hop());
		}
	}
}
