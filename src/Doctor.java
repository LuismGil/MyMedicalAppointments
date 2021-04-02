public class Doctor {
    static int id; // Autoincrement
    String name;
    String email;
    String speciality;

    Doctor() {
        System.out.println("Building Doctor Object");

    }

    Doctor(String name, String speciality) {
        System.out.println("the assigned doctor's name is: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID Doctor: " + id);
    }
}
