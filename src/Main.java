import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        showMenu();

        Doctor myDoctor = new Doctor("Anahi Salgado", "anahi@anahi.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        User user = new Doctor("Anahi", "ana@ana.com");
        user.showDataUser();

        User userPa = new Patient("Anahi", "ana@ana.com");
        userPa.showDataUser();

        /*
        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
         */

        /*
        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        System.out.println(patient);
         */



    }


}

