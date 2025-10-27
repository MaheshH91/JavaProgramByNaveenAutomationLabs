package staticblockpkg;

public class StaticBlockQuestion7 {
	static {
		System.out.println("Test -- static block");
	}
	public String name;
	static int age;

	static {
		StaticBlockQuestion7 e2 = new StaticBlockQuestion7();
		e2.name = "Mahesh";
		age = 35;
		System.out.println(e2.name + " " + age);
	}

	public static void main(String[] args) {

	}
}
