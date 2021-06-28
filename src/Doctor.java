import javax.print.Doc;

public class Doctor {
    // Attributes
    static int id; // Will be different for every object. Autoincrements on object creation.
    String name;
    String speciality;

    // Constructor without parameters
    Doctor() {
        System.out.println("Building an Object for class Doctor...");
        id++;
    }

    // Constructor with parameters
    Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
        System.out.println("Created an object of type Doctor...");
        System.out.println("Name: " + this.name);
        System.out.println("Speciality: " + this.speciality);
    }

    // Methods
    public void showName() {
        System.out.println(name);
    }

    public void showID() {
        System.out.println(id);
    }
}
