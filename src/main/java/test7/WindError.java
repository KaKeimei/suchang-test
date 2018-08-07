package test7;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import org.omg.CORBA.ARG_OUT;

import java.sql.SQLOutput;

/**
 * Created by suchang on 2018/08/07
 * p310 7.10(3)
 */
class NoteX {
	public static final int M = 0, S = 0, C = 0;
}
class Ins {
	public void play(int NoteX) {
		System.out.println("Ins played");
	}
}
class WindX extends Ins {
	public void play(NoteX n) {
		System.out.println("WindX played");
	}
}

public class WindError {
	public static void tune(Ins i) {
		i.play(NoteX.M);
	}

	public static void main(String[] args) {
		WindX flute = new WindX();
		tune(flute);
	}
}
