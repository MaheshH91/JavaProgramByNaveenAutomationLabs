package stringQuestions;

/*
* Check substring is present in a given String
*/

public class FindSubString {

	public static boolean isSubstring(String main, String sub) {

		return main.matches("(.*)" + sub + "(.*)");

	}

	public static void main(String[] args) {
		System.out.println(isSubstring("naveen automation labs", "labs"));
	}

}