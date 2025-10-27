package interviewPrograms.basicPrograms;

import java.util.HashMap;
import java.util.Map;

public class DigitFrequencyMap {

    public static void countDigitFrequency(long number) {
        Map<Character, Integer> digitMap = new HashMap<>();

        String numStr = String.valueOf(number);
        for (char ch : numStr.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitMap.put(ch, digitMap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Digit frequencies in " + number + ":");
        for (Map.Entry<Character, Integer> entry : digitMap.entrySet()) {
            System.out.println("Digit " + entry.getKey() + " -> " + entry.getValue() + " time(s)");
        }
    }

    public static void main(String[] args) {
        countDigitFrequency(120340987123L);
    }
}