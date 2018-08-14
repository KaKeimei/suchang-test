package test10;

import java.io.*;
import java.util.Vector;

/**
 * Created by suchang on 2018/08/14
 */
public class Test1002 {
	public static void main(String[] args) throws IOException {
		Vector v = new Vector();
//		File file = new File(".");
		try {
			BufferedReader input = new BufferedReader(new FileReader(args[0]));
			String s = new String();
			while ((s = input.readLine()) != null) {
				v.add(s);
			}
			input.close();
			Object[] array = v.toArray();
			for (int i = array.length - 1; i >= 0; i --) {
				System.out.println(array[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
