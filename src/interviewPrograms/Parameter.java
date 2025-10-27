package interviewPrograms;

public class Parameter {

    //  JVM allows up to 255 parameters for static methods
    // For instance methods, 1 slot is reserved for 'this', so max is 254 user-defined parameters

    //  This method has 255 parameters — valid only for static methods
    // If you try this with an instance method, it may fail at compile or runtime depending on the JVM
    public static void testing(
        int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10,
        int a11, int a12, int a13, int a14, int a15, int a16, int a17, int a18, int a19, int a20,
        // ... continue up to a255
        int a251, int a252, int a253, int a254, int a255
    )
    
    {
        System.out.println("Method with 255 parameters executed successfully!");
    }
    //  Non-static method with 254 parameters (max allowed by JVM)
    public void testing1(
        int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10,
        // ... continue up to a254
        int a251, int a252, int a253, int a254
    ) {
        System.out.println("Non-static method with 254 parameters executed!");
    }

    public static void main(String[] args) {

        //  Generate a simulated method signature with 255 parameters
        StringBuilder s1 = new StringBuilder("static void testing(");
        for (int i = 1; i <= 255; i++) {
            s1.append("int a").append(i);
            if (i < 255) s1.append(", ");
        }
        s1.append(");");

        //  Print the generated method signature
        System.out.println(s1);
    }
}