package interviewPrograms.basicPrograms;

public class PalindromeNumber {

	public static void checkPalindrome(int number) {
		int original = number;
		int reversed = 0;

		while (number != 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number /= 10;
		}

		if (original == reversed) {
			System.out.println(original + " is a Palindrome number.");
		} else {
			System.out.println(original + " is NOT a Palindrome number.");
		}
	}

	public static void main(String[] args) {
		// Test cases without Scanner
		int[] testNumbers = { 121, 12321, 45654, 78987, 12345, 23432 };

		System.out.println("Palindrome Number Check:");
		for (int num : testNumbers) {
			checkPalindrome(num);
		}
	}
}