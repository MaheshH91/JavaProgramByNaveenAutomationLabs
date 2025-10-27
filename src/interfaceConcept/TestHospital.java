package interfaceConcept;

public class TestHospital {

    public static void main(String[] args) {

        // Creating object of AppoloHospital
        AppoloHospital ap = new AppoloHospital();

        // Calling methods directly
        ap.ambulanceServices();
        ap.emergencyServices();
        ap.ENTServices();
        ap.neuroServices();
        ap.medicalInsurance();

        // Accessing static final variable
        System.out.println(ap.min_fee); // via object
        System.out.println(USMedical.min_fee); // via interface

        // Static method call from interface
        USMedical.services_911();

        // Default method call
        ap.intership();

        // Topcasting: Interface reference pointing to child class object
        USMedical us = new AppoloHospital();
        us.physioServices();
        us.oncologyServices();
        us.orthopedicServices();
        us.intership(); // default method

        UKMedical uk = new AppoloHospital();
        uk.ambulanceServices();
        uk.ENTServices();

        IndianMedical in = new AppoloHospital(); // No method call here
        in.neuroServices();
        in.emergencyServices();
        in.pediatricServices();
        IndianMedical.dengueServices();
    }
}