package interviewPrograms.basicPrograms;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class VowelCounter {

	// Method 1: Traditional loop
	public static int countVowelsClassic(String input) {
		int count = 0;
		String vowels = "aeiouAEIOU";
		for (char ch : input.toCharArray()) {
			if (vowels.indexOf(ch) != -1) {
				count++;
			}
		}
		return count;
	}

	// Method 2: Java 8 Streams
	public static long countVowelsStream(String input) {
		Set<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').stream()
				.collect(Collectors.toSet());

		return input.chars().mapToObj(c -> (char) c).filter(vowels::contains).count();
	}

	public static void main(String[] args) {
		String input = "Mahesh is mastering Java Streams";

		System.out.println("Input: " + input);
		System.out.println("Vowel count (Classic): " + countVowelsClassic(input));
		System.out.println("Vowel count (Streams): " + countVowelsStream(input));
	}
}
