package interviewPrograms.basicPrograms;

public class CheckIsNumber2 {

	public static void main(String[] args) {
		String[] testCases = { "12345", "007", "12a45", "", null, " 123", "123 " };

		for (String input : testCases) {
			System.out.println("Input: \"" + input + "\"");

			System.out.println("Using regex: " + isNumericRegex(input));
			System.out.println("Using iteration: " + isNumericIterative(input));
			System.out.println("Using streams: " + isNumericStream(input));
			System.out.println("---------------------------");
		}
	}

	// Method 1: Using Regular Expression
	public static boolean isNumericRegex(String str) {
		return str != null && str.matches("\\d+");
	}

	// Method 2: Using Character Iteration
	public static boolean isNumericIterative(String str) {
		if (str == null || str.isEmpty())
			return false;

		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c))
				return false;
		}
		return true;
	}

	// Method 3: Using Java 8 Streams
	public static boolean isNumericStream(String str) {
		return str != null && !str.isEmpty() && str.chars().allMatch(Character::isDigit);
	}
}