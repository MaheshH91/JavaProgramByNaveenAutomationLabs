package staticblockpkg;

public class StaticBlockQuestion4 {
int age;
static {
	StaticBlockQuestion4 obj=new StaticBlockQuestion4();
}
public static int createObject() {
	StaticBlockQuestion4 obj=new StaticBlockQuestion4();
	obj.age=40;
	return obj.age;
	
}
private StaticBlockQuestion4() {
	age=30;
}
public static void main(String[] args) {
	StaticBlockQuestion4 obj=new StaticBlockQuestion4();
	System.out.println(obj.age);
}
}
