package stringQuestions;

import java.util.Arrays;

public class StringAnagram {
	public static boolean isAnagram(String s1, String s2) {

		String str1 = s1.replaceAll("\\s", "");
		String str2 = s1.replaceAll("\\s", "");

		if (str1.length() != str2.length()) {
			return false;
		} else {
			char c1[] = str1.toLowerCase().toCharArray();
			char c2[] = str2.toLowerCase().toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			return Arrays.equals(c1, c2);
		}
	}

	public static void main(String[] args) {
		String s1 = "Listen";
		String s2 = "Silent";

		if (isAnagram(s1, s2)) {
			System.out.println(s1 + " and " + s2 + " are anagrams.");
		} else {
			System.out.println(s1 + " and " + s2 + " are NOT anagrams.");
		}

	}
}
