package test10;

import java.util.*;
import java.io.*;

/**
 * Created by suchang on 2018/08/14
 */
public class Test1004 {
	public static void main(String[] args) throws IOException {
		Vector v = new Vector();
		File file = new File("./SuChang.txt");
		try {
			BufferedReader input = new BufferedReader(new FileReader(file));
			String s = new String();
			while ((s = input.readLine()) != null) {
				v.add(s);
			}
			input.close();
			Object[] array = v.toArray();
			for (int i = array.length - 1; i >= 0; i--) {
				System.out.println(array[i].toString().toUpperCase());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
