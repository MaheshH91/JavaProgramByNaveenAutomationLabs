package interviewPrograms.basicPrograms;

public class PrimeNumber {

    /**
     * Checks whether a given number is prime.
     * @param num The number to check
     * @return true if prime, false otherwise
     */
    public static boolean isPrimeNumber(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;

        // Only check up to square root of num for efficiency
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    /**
     * Prints all prime numbers less than the given limit.
     * @param limit The upper bound (exclusive)
     */
    public static void printPrimeNumbersUpTo(int limit) {
        System.out.println("\nPrime numbers less than " + limit + ":");
        for (int i = 2; i < limit; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // for clean line break
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 20 };

        System.out.println("Prime Number Check:");
        for (int a : arr) {
            if (isPrimeNumber(a)) {
                System.out.println(a + " is a Prime number.");
            } else {
                System.out.println(a + " is NOT a Prime number.");
            }
        }

        printPrimeNumbersUpTo(7);
    }
}