package test10;

import java.io.*;
import java.util.*;

/**
 * Created by suchang on 2018/08/14
 */
public class Test1005 {
	 static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		Vector v = new Vector();
		File file = new File("./SuChang.txt");
		String specifics = "chapter";
		try {
			BufferedReader input = new BufferedReader(new FileReader(file));
			String s;
			while ((s = input.readLine()) != null) {
				v.add(s);
			}
			input.close();
			Object[] array = v.toArray();
			for (int i = 0; i < array.length; i ++) {
				String temp = array[i].toString();
				st = new StringTokenizer(temp);
				while (st.hasMoreTokens()) {
					String token = st.nextToken();
					if (token.equals(specifics)) {
						System.out.println(temp);
					} else {
						continue;
					}
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
