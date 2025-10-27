package interviewPrograms;

public class StringManipulations {

	public static void main(String[] args) {

		String string = "The rains have started here.";
		String string1 = "The rains Have started here.";

		System.out.println(string.length());

		System.out.println(string.charAt(5));

		System.out.println(string.indexOf('s')); // 1 st occurance of s

		System.out.println(string.indexOf('s', string.indexOf('s') + 1)); // 2nd occurance of s

		System.out.println(string.indexOf("have"));

		System.out.println(string.indexOf("hello"));// -1

		// String Comparison
		System.out.println(string.equals(string1));
		System.out.println(string.equalsIgnoreCase(string1));

		// small string from whole string
		// substring
		System.out.println(string.substring(0, 8));

		// trim
		String string2 = "  Hello World!  ";
		System.out.println(string2.trim());

		System.out.println(string2.replace(" ", ""));

		String date = "01-01-2025";
		System.out.println(date.replace("-", "/"));

		// Split
		String test = "Hello_World_Test_Selenium";
		String[] test2 = test.split("_");
		// System.out.println(Arrays.toString(test2));
		for (String str : test2) {
			System.out.println(str);
		}

		String string3 = "Cares";
		System.out.println(string3.concat("s"));

		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;

		System.out.println(x + y);
		System.out.println(a + b);
		System.out.println(x + y + a + b);
	}

}
