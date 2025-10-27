package arrayQuestions;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
	public static void getCharCount(String name) {

		Map<Character, Integer> charMap = new HashMap<>();

		char strArray[] = name.toCharArray();

		for (char c : strArray) {

			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.getOrDefault(c, 0) + 1);
			} else {
				charMap.put(c, 1);
			}

		}
		System.out.println(name + " : " + charMap);
	}

	public static void main(String[] args) {
		// test --> t=2,e=1,s=1
		// t--> t=1
		// test auto --> t=3,e=1,s=1, a=1, u=1, o=1

		getCharCount("test");
		System.out.println("*************");
		getCharCount("t");
		System.out.println("*************");
		getCharCount("t ");
		System.out.println("*************");
		getCharCount("tt");
		System.out.println("*************");
		getCharCount("testing java test");
		System.out.println("*************");
		getCharCount("  ");
	}
}
