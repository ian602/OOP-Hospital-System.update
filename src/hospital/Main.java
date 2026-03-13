import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter hospital name: ");
            String hospitalName = input.nextLine();

            Hospital hospital = new Hospital(hospitalName);
            hospital.showHospitalName();

            System.out.print("Enter doctor name: ");
            String docName = input.nextLine();

            System.out.print("Enter doctor age: ");
            int docAge = input.nextInt();

            System.out.print("Enter doctor salary: ");
            double docSalary = input.nextDouble();

            input.nextLine(); // clear buffer

            System.out.print("Enter doctor specialization: ");
            String specialization = input.nextLine();

            Doctor doc = new Doctor(docName, docAge, docSalary, specialization);

            System.out.print("Enter nurse name: ");
            String nurseName = input.nextLine();

            System.out.print("Enter nurse age: ");
            int nurseAge = input.nextInt();

            System.out.print("Enter nurse salary: ");
            double nurseSalary = input.nextDouble();

            input.nextLine();

            Nurse nurse = new Nurse(nurseName, nurseAge, nurseSalary);

            System.out.print("Enter patient name: ");
            String patientName = input.nextLine();

            System.out.print("Enter patient age: ");
            int patientAge = input.nextInt();

            input.nextLine();

            System.out.print("Enter patient illness: ");
            String illness = input.nextLine();

            Patient patient = new Patient(patientName, patientAge, illness);

            doc.displayInfo();
            nurse.displayInfo();
            patient.displayInfo();

            doc.treatPatient();

            System.out.println("Doctor Pay: " + doc.calculatePay());
            System.out.println("Nurse Pay: " + nurse.calculatePay());

        }

        catch (Exception e) {
            System.out.println("Invalid input! Please enter the correct data type.");
        }

        finally {
            input.close();
            System.out.println("Program finished.");
        }
    }
}