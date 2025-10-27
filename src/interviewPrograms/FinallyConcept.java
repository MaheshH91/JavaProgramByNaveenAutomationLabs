package interviewPrograms;

public class FinallyConcept {

	public static void main(String[] args) {
		System.out.println("=== Running test() ===");
		test();

		System.out.println("\n=== Running test2() ===");
		test2();

		System.out.println("\n=== Running division() with incorrect catch ===");
		division();

//        System.out.println("\n=== Running division2() with correct catch ===");
//        division2();
	}

	/**
	 * Demonstrates finally block execution after an exception is thrown and caught.
	 */
	public static void test() {
		try {
			System.out.println("Inside try block of test()");
			throw new RuntimeException("Test Exception");
		} catch (Exception e) {
			System.out.println("Inside catch block of test()");
		} finally {
			System.out.println("Inside finally block of test()");
		}
	}

	/**
	 * Demonstrates finally block execution without any exception.
	 */
	public static void test2() {
		try {
			System.out.println("Inside try block of test2()");
		} finally {
			System.out.println("Inside finally block of test2()");
		}
	}

	/**
	 * Demonstrates incorrect exception handling: catches NullPointerException
	 * instead of ArithmeticException. The finally block still executes.
	 */
	public static void division() {
		int i = 10;
		try {
			System.out.println("Inside try block of division()");
			int k = i / 0; // This throws ArithmeticException
		} catch (NullPointerException e) {
			System.out.println("Inside catch block of division()");
			System.out.println("This catch won't handle ArithmeticException");
		} finally {
			System.out.println("Inside finally block of division()");
		}

	}

	/**
	 * Demonstrates correct exception handling for divide-by-zero using
	 * ArithmeticException.
	 */
	public static void division2() {
		int i = 10;
		try {
			System.out.println("Inside try block of division2()");
			int k = i / 0; // This throws ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println("Inside catch block of division2()");
			System.out.println("Handled divide-by-zero error");
		} finally {
			System.out.println("Inside finally block of division2()");
		}
	}
}