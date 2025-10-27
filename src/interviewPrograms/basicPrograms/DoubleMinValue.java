package interviewPrograms.basicPrograms;

public class DoubleMinValue {

	public static void main(String[] args) {

		/**
		 * What is the value of double MIN_VALUE? Which one is bigger -> Double
		 * MIN_VALUE or 0.0d ? Which one is bigger -> Double MIN_VALUE or
		 * NEGATIVE_INFINITY?
		 */
		System.out.println(Double.MIN_VALUE); // Output: 4.9E-324
		System.out.println(Double.MIN_VALUE > 0.0d); // true
		System.out.println(Double.MIN_VALUE > Double.NEGATIVE_INFINITY); // true
	}

}
