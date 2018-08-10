package test9;

/**
 * Created by suchang on 2018/08/10
 */

public class Test902 {
	public static class ExClass extends Exception {

		ExClass(String s) {
			super(s);
//		System.out.println(s);
		}
	}
	public static void main(String[] args) {
		try {
			throw new ExClass("ExClass in Main");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
