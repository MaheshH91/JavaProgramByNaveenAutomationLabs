package interviewPrograms;

public class StringSwap {

	public static void main(String[] args) {

		// Initial strings to be swapped
		String a = "Hello";
		String b = "World";

		// Display original values
		System.out.println("Before Swapping:");
		System.out.println("String a = " + a);
		System.out.println("String b = " + b);

		// Step 1: Concatenate both strings and assign to 'a'

		a = a + b; // Now 'a' contains "HelloWorld"

		// Step 2: Extract original value of 'a' and assign to 'b'
		// 'a.length() - b.length()' gives the length of original 'a'
		b = a.substring(0, a.length() - b.length());

		// Step 3: Extract original value of 'b' and assign to 'a'
		// Now 'a' starts from the length of new 'b' to the end
		a = a.substring(b.length());

		// Display swapped values
		System.out.println("\nAfter Swapping:");
		System.out.println("String a = " + a);
		System.out.println("String b = " + b);
	}
}