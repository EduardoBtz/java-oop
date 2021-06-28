import javax.print.Doc;

public class Doctor {
    // Attributes
    int id;
    String name;
    String speciality;

    // Constructor without parameters
    Doctor() {
        System.out.println("Building an Object for class Doctor...");
    }

    // Constructor with parameters
    Doctor(int id, String name, String speciality) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
    }
    // Methods
    public void showName() {
        System.out.println(name);
    }
}
