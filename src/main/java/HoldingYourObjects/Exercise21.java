package HoldingYourObjects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by suchang on 2018/08/19
 * Using a Map<String,Integer>, follow the form of
 * UniqueWords.java to create a program that counts
 * the occurrence of words in a file. Sort the results
 * using Collections.sort( ) with a second argument
 * of String.CASE_INSENSITIVE_ORDER (to produce an
 * alphabetic sort), and display the result.
 */
public class Exercise21 {
	public static void main(String[] args) {
		Map<String, Integer> countmap = new TreeMap<>();
		List<String> orderlist = new LinkedList<>();
		File file = new File("./SuChang.txt");
		try {
			if (!file.exists()) {
				if (!file.createNewFile()) {
					System.out.println("file exists, creating file failure...");
				}
			}
			BufferedReader input = new BufferedReader(new FileReader(file));
			Scanner scanner = new Scanner(input);
			scanner.useDelimiter("\\W+");
			System.out.println();
			while (scanner.hasNext()) {
				String s = scanner.next();
				orderlist.add(s);
			}
			Collections.sort(orderlist,String.CASE_INSENSITIVE_ORDER);
			System.out.println(orderlist);
			Iterator<String> it = orderlist.listIterator();
			while (it.hasNext()) {
				String s = it.next();
				Integer count = countmap.get(s);
				countmap.put(s, count == null ? 1 : count + 1);
			}
			System.out.println(countmap);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
