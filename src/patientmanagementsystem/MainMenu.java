package patientmanagementsystem;

import java.util.Scanner;

/**
 *
 * @author jacqu
 */
public class MainMenu {

    static Scanner sc = new Scanner(System.in);

    // present main user menu
    public static void landingScreen() {
        boolean exit = false;
        String animalName;

        while (exit == false) {

            System.out.println("****************************************************************************************************************"
                    + "\n****************************************************************************************************************"
                    + "\n*********************************** Welcome to the Patient Management System ***********************************"
                    + "\n****************************************************************************************************************"
                    + "\n****************************************************************************************************************");

            System.out.println("\nPress:       1 - Add new patient              |       5 - Search for patient           |       9 - Exit"
                    + "\n             2 - Add new priority patient     |       6 - Update patient's info"
                    + "\n             3 - Select a position            |       7 - Delete patient"
                    + "\n             4 - Check patient's position     |       8 - Delete position entry");

            int userOption = sc.nextInt();

            switch (userOption) {

                case 1:
                    PatientHandlers.addNewPatient();
                    break;
                case 2:
                    PatientHandlers.addNewPriorityPatient();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 0:
                    System.out.println("\nYou chose to leave the application. Program has ended!");
                    exit = true;
                    sc.close();
                    break;
                default:
                    System.out.println("\nIncorrect option, please try again!");
                    break;

            }
        }
    }
}
