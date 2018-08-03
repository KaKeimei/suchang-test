package test4;

/**
 * Created by heqiming on 2018/08/03
 */
public class Test404 {
	Test404(String s) {
		System.out.println("Creating test404 with" + s + " and Array given");
	}

	public static void main(String[] args) {
		Test404[] a2 = new Test404[5];
		for(int i = 0; i < 6; i ++){
			a2[i] = new Test404(String.valueOf(i));
		}
	}
}
