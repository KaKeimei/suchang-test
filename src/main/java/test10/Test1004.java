package test10;

import java.util.*;
import java.io.*;

/**
 * Created by suchang on 2018/08/14
 */
public class Test1004 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		File file = new File("./SuChang.txt");
		try {
			BufferedReader input = new BufferedReader(new FileReader(file));
			String s;
			while ((s = input.readLine()) != null) {
				v.add(s);
			}
			input.close();
			for (int i = v.size() - 1; i >= 0; i--) {
				System.out.println(v.get(i).toUpperCase());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
