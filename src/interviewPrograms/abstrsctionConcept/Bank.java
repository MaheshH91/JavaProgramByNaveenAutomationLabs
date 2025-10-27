package interviewPrograms.abstrsctionConcept;

public abstract class Bank {
	// partial abstraction
	// hiding the implementation logic -- is called Abstraction
	//Abs class can have abs methods and non abs methods
	
	int amt=100;
	final int rate=10;
	static int loanRate =5;
	
	public abstract void loan(); // abstract method -- no method body

	public void credit() {
		System.out.println("Bank -- credit");
	}

	public void debit() {
		System.out.println("Bank -- debit");
	}

}
