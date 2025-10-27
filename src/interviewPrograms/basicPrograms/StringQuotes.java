package interviewPrograms.basicPrograms;

public class StringQuotes {
	public static void main(String[] args) {
		/*
		 * /"Hello"/ /'Hello'/ '/'Hello'/' "/'Hello'/" "Hello" I love "java" and
		 * "programming" and "movies" 'I love "java" and "programming" and "movies"'
		 */
		System.out.println("/\"Hello\"\"");
		System.out.println("/'Hello'/");
		System.out.println("'/'Hello'/'");
		System.out.println("\"/'Hello'/\"");
		System.out.println("\"Hello\"");
		System.out.println("I love \"java\" and \"programming\" and \"movies\"");
		System.out.println("'I love \"java\" and \"programming\" and \"movies\"'");
		System.out.println(getXpath("mahesh"));
		System.out.println(getXpath("testing"));
		System.out.println(getXpath("123"));
		System.out.println(getXpath("yes"));
	}

	public static String getXpath(String name) {
		String xpath = "//input[@id='" + name + "']";
		return xpath;

	}
}
