package interviewPrograms.basicPrograms;

public class StringObject {

    public static void main(String[] args) {

        // 🔹 String literals are stored in the String pool
        // Only one object "Hello World" is created and reused
        String s1 = "Hello World";
        String s2 = "Hello World";
        String s3 = s1; // s3 points to the same reference as s1

        String n1 = "Hello World";
        String n2 = "Hello World"; // All point to the same interned object

        // 🔍 Reference comparison using '=='
        System.out.println("s1 == s2 : " + (s1 == s2)); // true
        System.out.println("s2 == s3 : " + (s2 == s3)); // true
        System.out.println("s1 == s3 : " + (s1 == s3)); // true

        // ⚠️ Assignment instead of comparison — prints the assigned value
        System.out.println("n1 = n2 : " + (n1 = n2)); // prints "Hello World"
        System.out.println("s1 = n2 : " + (s1 = n2)); // prints "Hello World"

        // ✅ Value comparison using .equals()
        System.out.println("s1.equals(s2) : " + s1.equals(s2)); // true
        System.out.println("n1.equals(n2) : " + n1.equals(n2)); // true
    }
}