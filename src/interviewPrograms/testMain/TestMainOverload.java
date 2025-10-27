package interviewPrograms.testMain;

public class TestMainOverload {

    // This is the entry point for JVM
    public static void main(String[] args) {
        System.out.println("Main method with String[] args");
        main(10);           // Calls overloaded method
        main(5, 15);        // Calls overloaded method
        main("Hello");      // Calls overloaded method
    }

    public static void main(int args) {
        System.out.println("Main method with int arg: " + args);
    }

    public static void main(int a, int b) {
        System.out.println("Main method with two int args: " + a + ", " + b);
    }

    public static void main(String args) {
        System.out.println("Main method with single String arg: " + args);
    }
}
