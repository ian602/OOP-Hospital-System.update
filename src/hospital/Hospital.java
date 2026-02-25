public class Hospital {

    private String hospitalName;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void showHospitalName() {
        System.out.println("Welcome to " + hospitalName);
    }
}