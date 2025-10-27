package interviewPrograms.abstrsctionConcept;

public interface Car {
// byfefault final and static vars
	int wheels = 4;

	// Abstract methods
	void start();

	void stop();

	void refuel();

	// Default method using private helper
	default void musicSystem() {
		System.out.println("Car --- default music system");
		logFeature("Music System");
	}

	// Static method using private helper
	static void carInfo() {
		System.out.println("Car --- static method: General car info");
		logFeature("Car Info");
	}

	// 🔒 Private helper method (Java 9+)
	private static void logFeature(String featureName) {
		System.out.println("Logging feature: " + featureName);
	}

	
}