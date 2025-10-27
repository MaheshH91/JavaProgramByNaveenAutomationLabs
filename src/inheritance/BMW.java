package inheritance;

public class BMW extends Car {

	// when we have a method in parent class as well as in child class with the same
	// name and same nu
	// method overriding
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}

	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}

	// polymorphism -- many forms -- overloading and overriding ...
}