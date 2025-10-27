package interviewPrograms.basicPrograms;

import java.util.stream.IntStream;

public class PrintOneToHundreadWithoutAnyLoop {

    public static void main(String[] args) {

        // 🔹 Method 1: Using simple recursion
        System.out.println("Using printNum(int):");
        printNum(1);

        // 🔹 Method 2: Using recursion with start and end range
        System.out.println("\nUsing printNumber(int, int):");
        printNumber(1, 100);

        // 🔹 Method 3: Using Java 8 Stream API
        System.out.println("\nUsing IntStream:");
        IntStream.range(1, 101).forEach(System.out::println);
    }

    /**
     * 🔁 Recursive method to print 1 to 100
     * Uses a single parameter and increments until base case
     */
    public static void printNum(int num) {
        if (num <= 100) {
            System.out.println(num);
            printNum(num + 1); // Tail recursion
        }
    }

    /**
     * 🔁 Recursive method with start and end range
     * More flexible for custom ranges
     */
    public static void printNumber(int startNum, int endNum) {
        if (startNum <= endNum) {
            System.out.println(startNum);
            printNumber(startNum + 1, endNum);
        }
    }
}