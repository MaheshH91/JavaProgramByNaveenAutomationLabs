package interviewPrograms;

public class FinalizeConcept {

	// Constructor
	FinalizeConcept() {
		System.out.println("Object created.");
	}

	// finalize method (called before GC destroys the object)

	protected void finalize() {
		System.out.println("Finalize method called before object is garbage collected.");
	}

	public static void main(String[] args) {
		FinalizeConcept obj1 = new FinalizeConcept();
		FinalizeConcept obj2 = new FinalizeConcept();

		// Nullify references to make them eligible for GC
		obj1 = null;
		obj2 = null;

		// Request garbage collection
		System.gc();

		System.out.println("End of main method.");
	}
}