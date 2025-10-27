package interviewPrograms.basicPrograms;

public class DevideByZero {

	public static void main(String[] args) {

		/*
		 * Division by zero behaves differently for: 0 Integer types → throws
		 * ArithmeticException 🔹 Floating-point types (float, double) → returns
		 * Infinity or NaN
		 */

		// 🔴 Integer division by zero → Runtime Exception
		try {
			System.out.println("Integer division: 10 / 0 = " + (10 / 0));
		} catch (ArithmeticException e) {
			System.out.println("Integer division: 10 / 0 → Exception: " + e);
		}

		// ✅ Double division by zero → Infinity
		System.out.println("Double division: 10.0 / 0 = " + (10.0 / 0)); // Infinity

		// ✅ Mixed division (int / double) → Infinity
		System.out.println("Mixed division: 10 / 0.0 = " + (10 / 0.0)); // Infinity

		// ✅ Double literal division → Infinity
		System.out.println("Double division: 19.99999d / 0 = " + (19.99999d / 0)); // Infinity
		
		System.out.println(0.0 / 0); // Output: NaN
		System.out.println(0.0 / 0.0); // Output: NaN
	}
}