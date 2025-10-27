package interviewPrograms.basicPrograms;

public class Compare2Numbers {

    public static void main(String[] args) {

        // Autoboxing: primitive int 100 is converted to Integer object
        Integer num1 = 100;
        Integer num2 = 100;

        // Reference comparison using '=='
        // For values between -128 to 127, Java caches Integer objects (Integer.valueOf)
        // So num1 and num2 may refer to the same object
        if (num1 == num2) {
            System.out.println("Using '==': both are equal (same reference)");
        } else {
            System.out.println("Using '==': both are not equal (different reference)");
        }

        // Value comparison using .equals()
        // This checks whether the values inside the objects are equal
        if (num1.equals(num2)) {
            System.out.println("Using '.equals()': both are equal (same value)");
        } else {
            System.out.println("Using '.equals()': both are not equal (different value)");
        }

        // Let's test with values outside the Integer cache range
        Integer num3 = 200;
        Integer num4 = 200;

        if (num3 == num4) {
            System.out.println("200 == 200: same reference");
        } else {
            System.out.println("200 == 200: different reference");
        }

        if (num3.equals(num4)) {
            System.out.println("200 equals 200: same value");
        } else {
            System.out.println("200 equals 200: different value");
        }
    }
}