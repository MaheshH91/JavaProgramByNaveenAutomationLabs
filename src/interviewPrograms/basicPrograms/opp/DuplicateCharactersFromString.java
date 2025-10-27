package interviewPrograms.basicPrograms.opp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersFromString {

	public static void printDuplicateCharacters(String str) {
		if (str == null) {
			System.out.println("Null String");
			return;
		}
		if (str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}
		if (str.length() == 1) {
			System.out.println("Single character string");
			return;
		}

		char words[] = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<>();

		for (Character ch : words) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();

		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}

	}

	public static void main(String[] args) {
		printDuplicateCharacters("A");
		printDuplicateCharacters(" ");
		printDuplicateCharacters("");
		printDuplicateCharacters(null);
		printDuplicateCharacters("java");
		printDuplicateCharacters("Programming");
		printDuplicateCharacters("1000");
		printDuplicateCharacters("James Bond 007");
	}

}
