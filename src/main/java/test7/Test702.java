package test7;

/**
 * Created by suchang on 2018/08/07
 * p310 7.10(2)
 */
interface Rodent1 {
	void run();
}

class Mouse1 implements Rodent1 {
	Mouse1() {
		System.out.println("mouse");
	}
	public void run() {
		System.out.println("mouse run");
	}
}

class Gerbil1 extends Mouse1 {
	Gerbil1() {
		System.out.println("gerbil");
	}
	public void run() {
		System.out.println("gerbil run");
	}
}

class Hamster1 extends Gerbil1 {
	Hamster1() {
		System.out.println("hamster");
	}
	public void run() {
		System.out.println("hamster run");
	}
}

public class Test702 {
	public static Mouse1 ranrat() {
		switch ((int)(Math.random()*3)) {
			case 1: return new Mouse1();
			case 2: return new Gerbil1();
			case 3: return new Hamster1();
		}
		return null;
	}
	public static void main(String[] args) {
		Rodent1[] r = new Rodent1[10];
		for (int i = 0; i < r.length; i++) {
			r[i] = ranrat();
		}
		System.out.println("HAVING A REST");
		for (int i = 0;i < r.length; i ++) {
			r[i].run();
		}
	}
}

