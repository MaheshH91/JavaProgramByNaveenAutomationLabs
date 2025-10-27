package interviewPrograms.basicPrograms;

public class NullFactsDemo {

	public static void main(String[] args) {
		System.out.println("=== Cool Facts About null in Java ===");

		// 1. null can be assigned to any reference type
		String str = null;
		Object obj = null;
		Integer num = null;
		System.out.println("null assigned to String, Object, and Integer");

		// 2. Comparing null using ==
		System.out.println("null == null : " + (str == obj)); // true

		// 3. instanceof returns false for null
		System.out.println("str instanceof String : " + (str instanceof String)); // false

		// 4. Calling method on null causes NullPointerException
		try {
			System.out.println("Length of str: " + str.length()); // throws NPE
		} catch (NullPointerException e) {
			System.out.println("Calling method on null throws NullPointerException");
		}

		// 5. null can be cast to any reference type
		Object data = null;
		String casted = (String) data;
		System.out.println("null casted to String: " + casted); // still null

		// 6. Method overloading with null can be ambiguous
		NullFactsDemo demo = new NullFactsDemo();
//         demo.print(null); // Uncommenting this causes compile-time error due to ambiguity

		// 7. null is not a keyword, but a literal
		System.out.println("null is a literal, not a keyword");

		// 8. equals() on null throws exception
		try {
			System.out.println("null.equals(\"test\") : " + str.equals("test"));
		} catch (NullPointerException e) {
			System.out.println("Calling equals() on null throws NullPointerException");
		}
	}

	// Overloaded methods to demonstrate ambiguity
	public void print(String s) {
		System.out.println("String version");
	}

	public void print(Integer i) {
		System.out.println("Integer version");
	}
}