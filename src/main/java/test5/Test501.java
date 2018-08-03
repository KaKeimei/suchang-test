package test5;

/**
 * Created by heqiming on 2018/08/03
 */
public class Test501 {

	public int a = 0;
	private int b = 0;
	protected int c = 0;
	int d = 0;
	public void methoda() {
		System.out.println(a);
	}

	private void methodb() {
		System.out.println(b);

	}
	protected void methodc() {
		System.out.println(c);
	}
	void methodd() {
		System.out.println(d);
	}

	public static void main(String[] args) {
		Test501 t = new Test501();
		t.methoda();
		t.methodb();
		t.methodc();
		t.methodd();
	}
}