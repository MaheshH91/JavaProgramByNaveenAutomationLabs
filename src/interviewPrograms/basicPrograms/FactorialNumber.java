package interviewPrograms.basicPrograms;

public class FactorialNumber {
    public static void main(String[] args) {
        int num = 5;

        // Using for loop
        int factLoop = 1;
        for (int i = 1; i <= num; i++) {
            factLoop *= i;
        }
        System.out.println("Factorial of " + num + " using for loop: " + factLoop);

        // Using recursive function
        int factRec = factorialRecursive(num);
        System.out.println("Factorial of " + num + " using recursion: " + factRec);
    }

    // Recursive method
    static int factorialRecursive(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorialRecursive(n - 1);
    }
}