package test7;

/**
 * Created by suchang on 2018/08/07
 * WindError modified
 */
class NoteX1 {
	public static final int M = 0, S = 0, C = 0;
}
class Ins1 {
	public void play(int NoteX) {
		System.out.println("Ins1 played");
	}
}
class WindX1 extends Ins1 {
	@Override
	public void play(int NoteX) {
		System.out.println("WindX1 played");
	}

	public void play(NoteX n) {
		System.out.println("WindX played");
	}
}

public class Test703 {
	public static void tune(Ins1 i) {
		i.play(NoteX1.M);
	}

	public static void main(String[] args) {
		WindX1 flute = new WindX1();
		tune(flute);
	}
}

