package test6;

/**
 * Created by heqiming on 2018/08/03
 * P230 6.11(1)
 */
class A {
	A() {
		System.out.println("this is A");
	}
}

class B {
	B() {
		System.out.println("this is B");
	}
}

public class Test601 extends A {
	B b = new B();

	public static void main(String[] args) {
		Test601 t601 = new Test601();
	}
}
