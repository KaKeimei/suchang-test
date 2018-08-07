package test8;

/**
 * Created by suchang on 2018/08/07
 * p378 8.9(1)
 */
import java.util.*;

class Gerbil {
	private int gerbilNumber;
	Gerbil(int i) {
		gerbilNumber = i;
	}
	public void hop() {
		System.out.println("Gerbil number: " + gerbilNumber);
	}
}

public class Test801 {
	public static void main(String[] args) {
		Vector v = new Vector();
		for( int j = 1; j < 4; j ++) {
			v.addElement(new Gerbil(j));
			((Gerbil)(v.elementAt(j))).hop();
		}

	}
}
