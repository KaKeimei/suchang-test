package test10;

import java.io.*;
import java.util.*;

/**
 * Created by suchang on 2018/08/14
 */
public class Test1005 {
	private static StringTokenizer st;

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		File file = new File("./SuChang.txt");
		if (!file.exists()) {
			return;
		}
		String specifics = "chapter";
		try {
			BufferedReader input = new BufferedReader(new FileReader(file));
			String s;
			while ((s = input.readLine()) != null) {
				v.add(s);
			}
			input.close();
			for (String temp : v) {
				st = new StringTokenizer(temp);
				while (st.hasMoreTokens()) {
					String token = st.nextToken();
					if (token.equals(specifics)) {
						System.out.println(temp);
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
