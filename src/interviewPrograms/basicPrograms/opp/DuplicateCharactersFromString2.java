package interviewPrograms.basicPrograms.opp;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersFromString2 {

    public static void printDuplicateCharacters(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println(str == null ? "Null String" : "Empty String");
            return;
        }

        if (str.length() == 1) {
            System.out.println("Single character string");
            return;
        }

        // Convert to lowercase for case-insensitive comparison (optional)
        str = str.toLowerCase();

        // Count character frequencies
        Map<Character, Integer> charMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        // Print characters with frequency > 1
        System.out.println("Duplicate characters:");
        charMap.entrySet().stream()
               .filter(entry -> entry.getValue() > 1)
               .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }

    public static void main(String[] args) {
        printDuplicateCharacters("Mahesh");
        printDuplicateCharacters("Programming");
        printDuplicateCharacters("A");
        printDuplicateCharacters("");
        printDuplicateCharacters(null);
    }
}