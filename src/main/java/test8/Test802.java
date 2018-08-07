package test8;

import java.util.Enumeration;
import java.util.*;

/**
 * Created by suchang on 2018/08/07
 * p378 8.9(2)
 */
class Gerbil1 {
	private int gerbilNumber;
	Gerbil1(int i) {
		gerbilNumber = i;
	}
	public void hop() {
		System.out.println("Gerbil number: " + gerbilNumber);
	}
}

public class Test802 {
	public static void main(String[] args) {
		Vector v = new Vector();
		for( int j = 1; j < 4; j ++) {
			v.addElement(new Gerbil1(j));
//			((Gerbil1)(v.elementAt(j))).hop();
		}
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			((Gerbil1)e.nextElement()).hop();
//			e.nextElement().toString();
		}
	}
}

