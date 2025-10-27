package staticblockpkg;

public class StaticBlockQuestion3 {

	static {
		System.out.println("static block");
	}

	public static void test() {
		System.out.println("testing method");
	}

	public static void cover() {
		System.out.println("Cover method");
		test();
		
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		test();
		StaticBlockQuestion2.test();
		cover();
	}

}
