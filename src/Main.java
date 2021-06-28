import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        // showMenu();

        Doctor myDoctor = new Doctor("Eduardo Benitez", "Pediatry");
        Doctor myDoctor2 = new Doctor("Anahi Rodriquez", "Pediatry");


        Patient patient1 = new Patient("Lalo", "l@l.com");
        Patient patient2 = new Patient("Pris", "Garza");

        System.out.println(patient1.getName());
        System.out.println(patient2.getName());
        patient2 = patient1;

        System.out.println(patient1.getName());
        System.out.println(patient2.getName());

        patient2.setName("Manuel");
        System.out.println(patient1.getName());
        System.out.println(patient2.getName());


    }




}
