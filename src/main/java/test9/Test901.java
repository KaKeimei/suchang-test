package test9;

/**
 * Created by suchang on 2018/08/10
 */
class Exception extends Throwable {
	Exception(String s) {
		System.out.println(s);
	}
}
public class Test901 {
	public static void main(String[] args) {
		try {
			throw new Exception("Exception in main");

		} catch(Exception e) {
			e.toString();
			e.printStackTrace();
		} finally {
			System.out.println("Exception catch");
		}
	}
}
