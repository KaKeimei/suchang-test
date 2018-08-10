package test9;

/**
 * Created by suchang on 2018/08/10
 */
public class Test903 {
	public static void f() throws Test902.ExClass {
		System.out.println("ExClass thrown");
		throw new Test902.ExClass("exception found ...");
	}

	public static void main(String[] args) {
		try {
			f();
		} catch (Test902.ExClass e) {
			System.out.println("caught");
		}
	}
}
