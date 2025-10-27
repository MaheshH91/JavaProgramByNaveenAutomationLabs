package stringQuestions;

public class RemoveWhitespaceFromGivenString {
	public static void main(String[] args) {
		String input = "  Hello World \t Java \n ";
		String result = input.trim().replaceAll("\\s+", "");
		System.out.println("Without spaces: " + result);
	}
}