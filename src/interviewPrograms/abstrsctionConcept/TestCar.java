package interviewPrograms.abstrsctionConcept;

public class TestCar {
	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.musicSystem();
		b.theftSafety();

		Car myCar = new BMW();
		myCar.start();
		myCar.stop();
		myCar.refuel();
		myCar.musicSystem(); // Calls overridden method

		System.out.println("Number of wheels: " + Car.wheels);
		Car.carInfo(); // Calls static method from interface
	}
}