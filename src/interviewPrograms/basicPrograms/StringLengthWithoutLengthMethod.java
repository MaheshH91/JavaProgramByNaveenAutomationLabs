package interviewPrograms.basicPrograms;

import java.io.StringReader;

public class StringLengthWithoutLengthMethod {

    // Method 1: Using toCharArray and for-each loop
    public static int lengthUsingCharArray(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method 2: Using StringReader
    public static int lengthUsingStringReader(String str) throws Exception {
        StringReader reader = new StringReader(str);
        int count = 0;
        while (reader.read() != -1) {
            count++;
        }
        return count;
    }

    // Method 3: Using charAt and exception handling
    public static int lengthUsingCharAt(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // throws exception when index exceeds
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // reached end of string
        }
        return count;
    }

    // Method 4: Using recursion
    public static int lengthUsingRecursion(String str) {
        try {
            str.charAt(lengthUsingRecursion(str.substring(1)));
            return 1 + lengthUsingRecursion(str.substring(1));
        } catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) throws Exception {
        String input = "Mahesh";

        System.out.println("Input String: " + input);
        System.out.println("Using char array: " + lengthUsingCharArray(input));
        System.out.println("Using StringReader: " + lengthUsingStringReader(input));
        System.out.println("Using charAt + exception: " + lengthUsingCharAt(input));
        System.out.println("Using recursion: " + lengthUsingRecursion(input));
    }
}