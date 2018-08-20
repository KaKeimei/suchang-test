package HoldingYourObjects;
import java.io.*;
import java.util.*;

/**
 * Created by suchang on 2018/08/19
 * Create a Set of the vowels. Working from UniqueWords.Java,
 * count and display the number of vowels in each input word,
 * and also display the total number of vowels in the input file.
 */
public class Exercise16 {
	public static void generate(List<String> sin) {
		Set<Character> vowels = new TreeSet<>();
		Collections.addAll(vowels,'s','u','c','h','a','n','g');
		int countall = 0;
		for (String s : sin) {
			System.out.println(s + ":");
			int countone = 0;
			for (Character sChar : s.toCharArray()) {
				if (vowels.contains(sChar)) {
					countall ++;
					countone ++;
				}
			}
			System.out.println("vowels in '" + s + "' is " + countone);
		}
		System.out.println("All vowel number : " + countall);
	}

	public static void main(String[] args) {
		List<String> sin = new ArrayList<>();
		File file = new File("./SuChang.txt");
		try {
			if (!file.exists()) {
				if (!file.createNewFile()) {
					System.out.println("file exists, creating file failure...");
				}
			}
			BufferedReader input = new BufferedReader(new FileReader(file));
//			//StringBuilder method
//			StringBuilder sb = new StringBuilder();
//			while((line = input.readLine()) != null) {
//				sb.append(line + " ");
//			}
//			System.out.println(sb);
//			sin = Arrays.asList(Arrays.toString((sb.toString()).split("\\W+")));
//			System.out.println(sin);
			//Scanner method, the list auto-take scanner.next() as array element.
			Scanner scanner = new Scanner(input);
			scanner.useDelimiter("\\W+");
			while (scanner.hasNext()) {
				sin.add(scanner.next());
			}
			System.out.println(sin);
			generate(sin);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
