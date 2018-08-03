package test5;

/**
 * Created by heqiming on 2018/08/03
 */
public class Test502 {
	public  int a = 2;

	public Test502() {
		a++;
	}

	protected void prt(int i) {
		System.out.println("value of val is " + i);
	}

	public static void main(String[] args) {
		Test502 t = new Test502();
		t.prt(t.a);
	}
}
