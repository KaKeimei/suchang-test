package test5;

/**
 * Created by heqiming on 2018/08/03
 */
public class Test502 {
	public static int a = 2;

	public static void main(String[] args) {
		ProtectedTest t = new ProtectedTest();
		t.prt(a);
	}
}

class ProtectedTest{

	protected void prt(int i) {
		System.out.println("value of val is " + i);
	}
}
