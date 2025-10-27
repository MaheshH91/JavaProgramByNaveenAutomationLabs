package interviewPrograms.basicPrograms;

public class DoubleMinValue2 {

    public static void main(String[] args) {

        /**
         *  What is the value of Double.MIN_VALUE?
         * It's the smallest positive non-zero value a double can represent.
         * NOT the most negative value — that would be -Double.MAX_VALUE.
         */
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE); // 4.9E-324

        /**
         *  Long.MIN_VALUE and Integer.MIN_VALUE
         * These represent the most negative values for their respective types.
         */
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);       // -9223372036854775808
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE); // -2147483648

        /**
         *  Comparing Double.MIN_VALUE with 0.0d
         * Double.MIN_VALUE is a tiny positive number, so Math.min returns 0.0
         */
        System.out.println("Math.min(Double.MIN_VALUE, 0.0d) = " + Math.min(Double.MIN_VALUE, 0.0d)); // 0.0

        /**
         *  Comparing Integer.MIN_VALUE with 0
         * Integer.MIN_VALUE is negative, so Math.min returns Integer.MIN_VALUE
         */
        System.out.println("Math.min(Integer.MIN_VALUE, 0) = " + Math.min(Integer.MIN_VALUE, 0)); // -2147483648

        /**
         *  Comparing Float.MIN_VALUE with 0.0f
         * Float.MIN_VALUE is also a tiny positive number, so Math.min returns 0.0f
         */
        System.out.println("Math.min(Float.MIN_VALUE, 0.0f) = " + Math.min(Float.MIN_VALUE, 0.0f)); // 0.0

        /**
         *  Value of Float.MIN_VALUE
         * Smallest positive non-zero float value: 1.4E-45
         */
        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE); // 1.4E-45

        /**
         *  Comparing Double.MIN_VALUE with Double.NEGATIVE_INFINITY
         * NEGATIVE_INFINITY is the lowest possible value, so Math.min returns NEGATIVE_INFINITY
         */
        System.out.println("Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY) = " +
                Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY)); // -Infinity
    }
}