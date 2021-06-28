import static java.lang.Math.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Richard Hendricks";
        myDoctor.showName();
        double number = PI;
    }

    public static void showMenu() {
        System.out.println("Welcome to My Appointments");
        System.out.println("Select your option.");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("1. Patient");
            System.out.println("1. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    ShowPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for your visit!");
                    break;
                default:
                    System.out.println("Please select a correct answer.");
            }
        }while (response != 0);
    }

    public  static void ShowPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}
