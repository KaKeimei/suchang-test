package test7;

/**
 * Created by suchang on 2018/08/07
 * p301 7.10(1)
 */

class Rodent {
	Rodent() {
		System.out.println("rodent");
	}
	public void run() {
		System.out.println("rodent run");
	}
}

class Mouse extends Rodent {
	Mouse() {
		System.out.println("mouse");
	}
	@Override
	public void run() {
		System.out.println("mouse run");
	}
}

class Gerbil extends Mouse {
	Gerbil() {
		System.out.println("gerbil");
	}
	@Override
	public void run() {
		System.out.println("gerbil run");
	}
}

class Hamster extends Gerbil {
	Hamster() {
		System.out.println("hamster");
	}
	@Override
	public void run() {
		System.out.println("hamster run");
	}
}

public class Test701 {
	public static Rodent ranrat() {
		switch ((int)(Math.random()*3)) {
			case 0: return new Rodent();
			case 1: return new Mouse();
			case 2: return new Gerbil();
			case 3: return new Hamster();
			default: return null;
		}
	}
	public static void main(String[] args) {
		Rodent[] s = new Rodent[10];
		for (int i = 0; i < s.length; i++) {
			s[i] = ranrat();
		}
		for (int i = 0;i < s.length; i ++) {
			s[i].run();
		}
	}
}