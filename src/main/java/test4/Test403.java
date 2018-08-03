package test4;

/**
 * Created by heqiming on 2018/08/03
 */
public class Test403 {
	Test403(String s) {
		System.out.println("Creating test403 with" + s);
	}
	public static void main(String[] args) {
		Test403[] a1 = new Test403[5];
		Test403 testInstance = a1[2];
		System.out.println(testInstance.toString());
	}
}
