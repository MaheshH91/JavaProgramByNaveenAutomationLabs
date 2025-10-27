package interviewPrograms.basicPrograms;

public class NotANumber {

    public static void main(String[] args) {

        // 🔴 Integer division by zero throws ArithmeticException
        try {
//            System.out.println("2 / 0 = " + (2 / 0));
        } catch (ArithmeticException e) {
            System.out.println("2 / 0 → Exception: " + e);
        }

        // ✅ Floating-point division by zero → Infinity
        System.out.println("2.0 / 0.0 = " + (2.0 / 0.0)); // Infinity

        // ✅ 0.0 / 0.0 → NaN (undefined in IEEE 754)
        System.out.println("0.0 / 0.0 = " + (0.0 / 0.0)); // NaN

        // ✅ Square root of negative number → NaN
        System.out.println("Math.sqrt(-1) = " + Math.sqrt(-1)); // NaN

        // 🔍 NaN is not equal to itself
        System.out.println("Float.NaN == Float.NaN → " + (Float.NaN == Float.NaN)); // false
        System.out.println("Float.NaN != Float.NaN → " + (Float.NaN != Float.NaN)); // true

        // ⚠️ Modulus by zero with floating-point → NaN
        double nan = 2.1 % 0; // NaN
        System.out.println("2.1 % 0 = " + nan); // NaN

        // 🔍 NaN compared to itself → false
        System.out.println("nan == nan → " + (nan == nan)); // false

        // ✅ Use Double.isNaN() to check safely
        System.out.println("Double.isNaN(nan) → " + Double.isNaN(nan)); // true
    }
}