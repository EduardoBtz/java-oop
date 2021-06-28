import javax.print.Doc;
import java.util.Date;
import java.util.ArrayList;

public class Doctor {
    // Attributes
    static int id; // Will be different for every object. Autoincrements on object creation.
    String name;
    String speciality;

    // Constructor without parameters
    Doctor() {
        System.out.println("Building an Object for class Doctor...");
    }

    // Constructor with parameters
    Doctor(String name, String speciality) {
        id++;
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

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
