package interviewPrograms.abstrsctionConcept;

public class TestBank {

	public static void main(String[] args) {

		HDFCBank hb=new HDFCBank();
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
		
		Bank bank= new HDFCBank();
		bank.credit();
		bank.debit();
		bank.loan();
		
	}

}
