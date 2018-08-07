package test8;

import java.util.HashMap;

/**
 * Created by heqiming on 2018/08/07
 */
public class Test803 {
	public static void main(String[] args) {
		HashMap<String, String> dicMap = new HashMap<>();
		for (char c = 'a'; c <= 'z'; c++) {
			dicMap.put(String.valueOf(c), String.valueOf(c).toUpperCase());
		}
		char[] chars = {'a', 'i', 'o'};
		for (char aChar : chars) {
			System.out.println(dicMap.get(String.valueOf(aChar)));
		}
	}
}
