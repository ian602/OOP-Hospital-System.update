public class Nurse extends MedicalStaff {

    public Nurse(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public double calculatePay() {
        return getSalary();
    }

    @Override
    public void displayInfo() {
        System.out.println("Nurse: " + getName() +
                ", Age: " + getAge());
    }
}