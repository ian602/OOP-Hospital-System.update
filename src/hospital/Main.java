package hospital;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();
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

            System.out.print("How many patients do you want to enter? ");
            int number = input.nextInt();
            input.nextLine();

            for (int i = 0; i < number; i++) {

                System.out.println("\nEnter details for patient " + (i + 1));

                System.out.print("Enter patient name: ");
                String patientName = input.nextLine();

                System.out.print("Enter patient age: ");
                int patientAge = input.nextInt();
                input.nextLine();

                System.out.print("Enter patient illness: ");
                String illness = input.nextLine();

                Patient patient = new Patient(patientName, patientAge, illness);

                patients.add(patient);
            }
            doc.displayInfo();
            nurse.displayInfo();
            System.out.println("\n--- Patient List ---");

            for (Patient p : patients) {
                p.displayInfo();
            }
            try {
                FileWriter writer = new FileWriter("patients.txt");

                for (Patient p : patients) {
                    writer.write(p.toString() + "\n");
                }

                writer.close();
                System.out.println("Data saved to file.");

            } catch (IOException e) {
                System.out.println("Error writing to file.");
            }
            try {
                File file = new File("patients.txt");
                Scanner fileReader = new Scanner(file);

                System.out.println("\n--- Reading from file ---");

                while (fileReader.hasNextLine()) {
                    String data = fileReader.nextLine();
                    System.out.println(data);
                }

                fileReader.close();

            } catch (Exception e) {
                System.out.println("Error reading file.");
            }
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