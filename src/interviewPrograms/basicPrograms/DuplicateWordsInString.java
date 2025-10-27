package interviewPrograms.basicPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {
// Hey java is java best language is java
	// java: 3
	// is: 2

	public static void main(String[] args) {
		String string = "Hey java is java best language is java";
		finalDuplicateWords(string);
	}

	public static void finalDuplicateWords(String string) {
		String[] words = string.split("\\s");
		Map<String, Integer> wordCount = new HashMap<>();
		
		//to check each word in given array:
		for(String word: words) {
			
			//if word is present:
			if(wordCount.containsKey(word)) {
				wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
			}else {
				wordCount.put(word, 1);
			}
		}
		//Extracting all the keys of map - wordCount
		Set<String> wordsInStrings=wordCount.keySet();
		
		// loop through all the words in wordCount:
		for(String word: wordsInStrings) {
			if (wordCount.get(word)>1) {
				System.out.println(word+" : "+wordCount.get(word));
				
			}
			
		}

	}
}
