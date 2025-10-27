package interviewPrograms;

public class Swap2NumWithoutUsingThirdVar {

    public static void main(String[] args) {

        // Method 1: Using + and - Operators
        int a1 = 5;
        int b1 = 10;
        System.out.println("Before Swap (+/-): a1 = " + a1 + ", b1 = " + b1);
        a1 = a1 + b1;
        b1 = a1 - b1;
        a1 = a1 - b1;
        System.out.println("After Swap (+/-): a1 = " + a1 + ", b1 = " + b1);
        System.out.println("--------------------------------");

        // Method 2: Using * and / Operators
        int a2 = 5;
        int b2 = 10;
        System.out.println("Before Swap (*,/): a2 = " + a2 + ", b2 = " + b2);
        a2 = a2 * b2;
        b2 = a2 / b2;
        a2 = a2 / b2;
        System.out.println("After Swap (*,/): a2 = " + a2 + ", b2 = " + b2);
        System.out.println("--------------------------------");

        // Method 3: Using Bitwise XOR ^ Operator
        int a3 = 5;
        int b3 = 10;
        System.out.println("Before Swap (^): a3 = " + a3 + ", b3 = " + b3);
        a3 = a3 ^ b3;
        b3 = a3 ^ b3;
        a3 = a3 ^ b3;
        System.out.println("After Swap (^): a3 = " + a3 + ", b3 = " + b3);
    }
}