package staticblockpkg;

class Test {
	static {
		System.out.println("Test -- Static Block");
	}
	public static final int x = 20;

}

public class StaticBlockQuestion8 {
	public static void main(String[] args) {
		System.out.println(Test.x);
	}
}
