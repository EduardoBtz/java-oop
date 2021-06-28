import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        // showMenu();

        Doctor myDoctor = new Doctor("Eduardo Benitez", "Pediatry");
        Doctor myDoctor2 = new Doctor("Anahi Rodriquez", "Pediatry");

        Patient patient1 = new Patient("Lalo", "l@l.com");
        Patient patient2 = new Patient("Pris", "Garza");

        patient2 = patient1;
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        
    }




}
