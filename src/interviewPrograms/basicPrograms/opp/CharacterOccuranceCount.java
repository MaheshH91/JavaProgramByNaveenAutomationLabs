package interviewPrograms.basicPrograms.opp;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccuranceCount {
	public static void countUsingCharArray(String str) {
	    int[] freq = new int[256]; // ASCII range

	    char[] chars = str.toCharArray();
	    for (char ch : chars) {
	        freq[ch]++;
	    }

	    for (int i = 0; i < freq.length; i++) {
	        if (freq[i] > 0) {
	            System.out.println((char) i + " : " + freq[i]);
	        }
	    }
	}
	public static void countUsingCharAt(String str) {
	    int[] freq = new int[256];

	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        freq[ch]++;
	    }

	    for (int i = 0; i < freq.length; i++) {
	        if (freq[i] > 0) {
	            System.out.println((char) i + " : " + freq[i]);
	        }
	    }
	}
	public static void countUsingStreams(String str) {
	    Map<Character, Long> freqMap = str.chars()
	        .mapToObj(c -> (char) c)
	        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	    freqMap.forEach((ch, count) -> System.out.println(ch + " : " + count));
	}
	public static void main(String[] args) {
		String string="I love coding and testing";
		
		//CharArray - forloop
		//str.len -- charAt(i)
		//Streams
//		countUsingCharArray(string);
//		countUsingCharAt(string);
		countUsingStreams(string);
		
		
		
	}

}
