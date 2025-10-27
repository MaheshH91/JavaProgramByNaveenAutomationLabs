package interviewPrograms;

// Reverse a string
public class ReverseString {
	public static void main(String[] args) {
		//
		String string = "Selenium";
		String revString = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			revString += string.charAt(i);
		}
		System.out.println(revString);

		StringBuffer stringBuffer = new StringBuffer(string);
		String revString2 = stringBuffer.reverse().toString();
		System.out.println(revString2);

		StringBuilder stringBuilder = new StringBuilder(string);
		String revString3 = stringBuilder.reverse().toString();
		System.out.println(revString3);
	}
}
