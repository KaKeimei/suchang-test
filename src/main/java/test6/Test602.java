package test6;

/**
 * Created by suchang on 2018/08/07
 * P230 6.11(2)
 */
class A1 {
	A1(boolean b) {
		System.out.println("A1 constructed correctly with b: " + b);
	}
}

class B1 {
	B1(int i) {
		System.out.println("B1 wish val int i");
	}
}

public class Test602 {
	B1 b = new B1(5);
	Test602(A1 b2) {
		boolean b3 = true;
		new A1(b3);
		System.out.println("Test602 constructed" + b2);
	}

	public static void main(String[] args) {
		new Test602(new A1(false));
	}
}
