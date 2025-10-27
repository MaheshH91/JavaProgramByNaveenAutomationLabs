package interviewPrograms.basicPrograms.opp;

class car {
/// Static method: belongs to the class, not the object
	// Note: This method is hidden, not overridden in child class
	public static void start() {
		System.out.println("Car --- start");
	}

	public void stop() {
		System.out.println("Car --- stop");
	}

	public void refuel() {
		System.out.println("Car --- refuel");
	}
}

class BMW extends car {
    // This method hides the static method from parent class
    // Technically not overriding due to static context
//	@Override
//	public void start() {
//        System.out.println("BMW --- start");
//    }
	public static void start() {
        System.out.println("BMW --- start");
    }


}

public class TestCar {
	public static void main(String[] args) {
		// Creating BMW object
        BMW bmw = new BMW();

        // Calls BMW's version of start (method hiding)
        bmw.start();

        // Inherited methods from car class
        bmw.stop();
        bmw.refuel();
	}

}
