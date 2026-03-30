package hospital;
public class Doctor extends MedicalStaff implements Treatable {

    private String specialization;

    public Doctor(String name, int age, double salary, String specialization) {
        super(name, age, salary);
        this.specialization = specialization;
    }

    @Override
    public double calculatePay() {
        return getSalary() + 5000; // bonus
    }

    @Override
    public void treatPatient() {
        System.out.println("Doctor is treating the patient.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Doctor: " + getName() +
                ", Age: " + getAge() +
                ", Specialization: " + specialization);
    }
}