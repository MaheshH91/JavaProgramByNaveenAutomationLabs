package interviewPrograms.basicPrograms;

public class CheckIsNumber {

	// Utility method to check if a CharSequence is null or empty
	public static boolean isEmpty(CharSequence cs) {
		return cs == null || cs.length() == 0;
	}

	// Method to check if the input contains only digits
	public static boolean isNummeric(CharSequence cs) {
		if (isEmpty(cs)) {
			return false; // null or empty string is not numeric
		}

		int len = cs.length();
		for (int i = 0; i < len; i++) {
			if (!Character.isDigit(cs.charAt(i))) {
				return false; // found a non-digit character
			}
		}
		return true; // all characters are digits
	}

	public static void main(String[] args) {
		// Test cases to validate the method
		System.out.println("null     -> " + isNummeric(null)); // false
		System.out.println("\"test\"   -> " + isNummeric("test")); // false
		System.out.println("\"\"       -> " + isNummeric("")); // false
		System.out.println("\" \"      -> " + isNummeric(" ")); // false
		System.out.println("\"123\"    -> " + isNummeric("123")); // true
		System.out.println("\"test123\"-> " + isNummeric("test123")); // false
	}
}