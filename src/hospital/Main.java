public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Hospital");
        hospital.showHospitalName();

        Doctor doc = new Doctor("John", 40, 50000, "Cardiology");
        Nurse nurse = new Nurse("Mary", 30, 30000);
        Patient patient = new Patient("Peter", 25, "Flu");

        doc.displayInfo();
        nurse.displayInfo();
        patient.displayInfo();

        doc.treatPatient();

        System.out.println("Doctor Pay: " + doc.calculatePay());
        System.out.println("Nurse Pay: " + nurse.calculatePay());
    }
}