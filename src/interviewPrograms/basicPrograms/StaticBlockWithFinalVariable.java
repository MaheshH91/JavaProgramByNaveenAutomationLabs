package interviewPrograms.basicPrograms;

//  Class with a static block and a final static variable
class TestDemo {

    // Final static variable — a compile-time constant
    public static final int x = 10;

    // Static block — runs when the class is initialized
    static {
        System.out.println("main -- class static block...");
    }
}

//  Main class to test static behavior
public class StaticBlockWithFinalVariable {

    public static void main(String[] args) {

        // Accessing final static variable from TestDemo
        // Since 'x' is a compile-time constant, the value is inlined
        // So TestDemo class is NOT initialized — static block does NOT run
        System.out.println(TestDemo.x); // Output: 10

        //  If you access a non-final static member, the static block WILL execute
        // Example:
        // System.out.println(TestDemo.y); // would trigger static block
    }
}