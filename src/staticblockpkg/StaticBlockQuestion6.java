package staticblockpkg;

public class StaticBlockQuestion6 {

	String name;
	static int age;
	
	static {
		StaticBlockQuestion6 e2= new StaticBlockQuestion6();
		e2.name="Mahesh";
		age=35;
		System.out.println(e2.name+" "+age);
	}
	public static void main(String[] args) {
		
	}
}
