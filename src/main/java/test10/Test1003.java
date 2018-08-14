package test10;

import java.io.*;
import java.util.Vector;

/**
 * Created by suchang on 2018/08/14
 */
public class Test1003 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		File file = new File("./Suchang.txt");
		File file2 = new File("./sc.txt");
		try {
			if (!file.exists()) {
				if (!file.createNewFile()) {
					System.out.println("file exists, creating file failure...");
				}
			}
			if (!file2.exists()) {
				if (!file.createNewFile()) {
					System.out.println("file exists, creating file failure...");
				}
			}
			BufferedReader input = new BufferedReader(new FileReader(file));
			String s;
			while ((s = input.readLine()) != null) {
				v.add(s);
			}
			input.close();
			BufferedWriter output = new BufferedWriter(new FileWriter(file2));
			int line = 1;
			for (String tem:v) {
				output.write(line + ": " + tem + "\n");
				line ++;
			}
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
