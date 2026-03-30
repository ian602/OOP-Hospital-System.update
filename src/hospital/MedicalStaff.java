package hospital;
public abstract class MedicalStaff extends Person implements Payable {

    private double salary;

    public MedicalStaff(String name, int age, double salary) {
        super(name, age);  // use of super
        this.salary = salary;  // use of this
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}