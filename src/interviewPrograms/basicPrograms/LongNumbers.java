package interviewPrograms.basicPrograms;

public class LongNumbers {
    public static void main(String[] args) {

        /*
         *  longNumberWithoutL:
         * All operands are int literals -> result is computed as int
         * 1000 * 60 * 60 * 24 * 365 = 31,536,000
         * This exceeds Integer.MAX_VALUE (2,147,483,647) → overflow occurs
         * Result is incorrect due to overflow, then assigned to long
         */
        long longNumberWithoutL = 1000 * 60 * 60 * 24 * 365;

        /*
         * longNumberWithL:
         * One operand (365L) is long → entire expression promoted to long
         * No overflow → correct result: 31,536,000
         */
        long longNumberWithL = 1000 * 60 * 60 * 24 * 365L;

        //  Output comparison
        System.out.println("Without L (overflowed int → long): " + longNumberWithoutL);
        System.out.println("With L (correct long arithmetic): " + longNumberWithL);
    }
}