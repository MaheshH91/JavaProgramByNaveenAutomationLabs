package interviewPrograms.basicPrograms;

public class NullArgument {
	public static void main(String[] args) {
		test(null);
	}

	public static void test(Object o) {
		System.out.println("Object Argument");
	}

	public static void test(String s) {
		System.out.println("String Argument");
	}

}
