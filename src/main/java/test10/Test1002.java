package test10;

import java.io.*;
import java.util.Vector;

/**
 * Created by suchang on 2018/08/14
 */
public class Test1002 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		try {
			BufferedReader input = new BufferedReader(new FileReader(args[0]));
			String s;
			while ((s = input.readLine()) != null) {
				v.add(s);
			}
			input.close();
			for (int i = v.size() - 1; i >= 0; i --) {
				System.out.println(v.get(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
