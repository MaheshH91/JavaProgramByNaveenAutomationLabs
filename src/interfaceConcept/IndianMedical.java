package interfaceConcept;

// Interface representing Indian medical services
public interface IndianMedical {

    // Abstract methods (no body)
    void emergencyServices();

    void neuroServices();

    void pediatricServices();

    // Static method with body (allowed from Java 8)
    static void dengueServices() {
        System.out.println("Indian --- Dengue services");
    }
}