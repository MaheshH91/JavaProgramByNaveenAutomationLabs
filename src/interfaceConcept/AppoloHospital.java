package interfaceConcept;

// Concrete class implementing multiple interfaces
public class AppoloHospital extends GlobalPatientData implements USMedical, UKMedical, IndianMedical {

    // Overridden methods from USMedical
    @Override
    public void physioServices() {
        System.out.println("AP - physio");
    }

    @Override
    public void oncologyServices() {
        System.out.println("AP - oncology");
    }

    @Override
    public void orthopedicServices() {
        System.out.println("AP - orthopedic");
    }

    @Override
    public void radiologyServices() { // Renamed for camelCase consistency
        System.out.println("AP - radiologyServices");
    }

    // Overridden methods from UKMedical
    @Override
    public void ENTServices() {
        System.out.println("AP - ENTServices");
    }

    @Override
    public void ambulanceServices() {
        System.out.println("AP - ambulanceServices");
    }

    // Overridden methods from IndianMedical
    @Override
    public void emergencyServices() {
        System.out.println("AP - emergencyServices");
    }

    @Override
    public void neuroServices() {
        System.out.println("AP - neuroServices");
    }

    @Override
    public void pediatricServices() {
        System.out.println("AP - pediatricServices");
    }

    // Class-specific methods (not part of interfaces)
    public void OPDServices() {
        System.out.println("AP - OPDServices");
    }

    public void medicalInsurance() {
        System.out.println("AP - medicalInsurance");
    }

    public void pathologyServices() {
        System.out.println("AP - pathologyServices");
    }

    @Override
    public void polioServices() {
        System.out.println("AP - polioServices");
    }
}