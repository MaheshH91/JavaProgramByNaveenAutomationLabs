package interviewPrograms.abstrsctionConcept;

public class BMW implements Car {

    @Override
    public void start() {
        System.out.println("BMW --- start");
    }

    @Override
    public void stop() {
        System.out.println("BMW --- stop");
    }

    @Override
    public void refuel() {
        System.out.println("BMW --- refuel");
    }

    @Override
    public void musicSystem() {
        System.out.println("BMW --- premium music system");
        // Cannot call logFeature() directly — it's private to the interface
    }
 // non overriden method
 	public void theftSafety() {
     		System.out.println("BMW --- Theftsafety");
 		
 	}

}