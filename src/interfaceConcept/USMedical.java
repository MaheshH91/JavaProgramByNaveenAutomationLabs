package interfaceConcept;

public interface USMedical extends WHO {

	// Interface variables are public, static, and final by default
	int min_fee = 10;

	// Abstract method declarations
	void physioServices();

	void oncologyServices();

	void orthopedicServices();

	void radiologyServices(); // Renamed for camelCase consistency

	// Static method with body (Java 8+)
	static void services_911() {
		System.out.println("US - 911 services....");
	}

	// Default method with body (Java 8+)
	default void intership() {
		System.out.println("US internship");
		cTScan_Services(); // Calling private method
	}

	// Private method (Java 9+)
	private void cTScan_Services() {
		System.out.println("US --- cTScan_Services");
	}

	// can not create the object of Interface
	// only method declaration -- method prototype -- no method body
	// can not create static prototype method in Interface
//    static void xrayServices();

	// but interface vars are static and final by default
	// From JDK1.8 Interface can have static method but with method body
}