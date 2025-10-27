package inheritance;

public class TestCar {
	public static void main(String[] args) {

		BMW b = new BMW();
		b.stop();
		b.start();
		b.fillFuel();
		b.autoParking();
		b.engine();

		Car c = new Car();
		c.start();
		c.stop();
		c.fillFuel();
		c.engine();

//Top Casting
		Car c1 = new BMW();// child class object can be referred by parent class ref variable ...
		c1.start();
		c1.stop();
		c1.fillFuel();
		c.engine();

		// Top Casting
		Vehicle v1 = new BMW();
		v1.engine();

//down casting:
		BMW b1 = (BMW) new Car();// ClassCastException
		// b1.autoParking();
		// b1.engine();
		// b1.fillFuel();
		
	}
}