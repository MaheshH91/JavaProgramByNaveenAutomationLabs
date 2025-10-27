package stringQuestions;

public class StringCapitalWordCount {

	/**
	 * Get the Count of total words in a given Capitalized String
	 * 
	 * @author naveenautomationlabs
	 * 
	 */

	public static void main(String[] args) {
		String str = "NaveenAutomationLabsYoutube";
		
		int count =0;
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i)>='A'&& str.charAt(i)<='Z') {
				count++;
			}
		}
	}
}
