package model;

public class Nurse extends User {
    private String speciality;

    public Nurse(String name, String email) {
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Employee of the Green Cross Hospital");
        System.out.println("department: Nutriology, pediatrics");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
