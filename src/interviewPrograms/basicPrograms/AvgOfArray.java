package interviewPrograms.basicPrograms;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AvgOfArray {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 3, 2, 3, 4 };

        int total = 0;
        for (int i : num) {
            total += i;
        }

        System.out.println("Total: " + total);
        System.out.println("Average (Classic): " + ((double) total / num.length));

        // Java 8: Streams
        OptionalDouble avg = Arrays.stream(num).average();
        System.out.println("Average (Streams): " + avg.orElse(0.0));
    }
}