package test10;
import java.io.*;
import java.util.Stack;
import java.util.Vector;

/**
 * Created by suchang on 2018/08/14
 */
public class Test1001 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		File file = new File("./Suchang.txt");
		try {
			BufferedReader input = new BufferedReader(new FileReader(file));
			String s;
			while ((s = input.readLine()) != null) {
				v.add(s);
			}
			input.close();
			Stack<String> stack = new Stack<>();
			for (String vectorString : v) {
				stack.push(vectorString);
			}
			while (!stack.isEmpty()) {
				System.out.println(stack.pop());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
