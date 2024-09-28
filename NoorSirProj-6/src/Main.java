import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        // Creating file so that it is confirmed that the files are opened.
        try {
            RandomAccessFile Authorization = new RandomAccessFile("UserIdAuthorization.txt", "rw");
            Authorization.close();
        } catch (Exception e) {
            System.out.println("Authorization file not found");
        }

        try {
            RandomAccessFile courses = new RandomAccessFile("CourseInfo.txt", "rw");
            courses.close();
        } catch (Exception e) {
            System.out.println("Student file not found");
        }

        try {
            RandomAccessFile Student = new RandomAccessFile("StudentInfo.txt", "rw");
            Student.close();
        } catch (Exception e) {
            System.out.println("Student file not found");
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 to login \nPress 2 to register \nPress 3 to exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Enter your username: ");
                String username = scanner.nextLine();
                System.out.println("Enter your password: ");
                String password = scanner.nextLine();

                if (StudentManagement.login(username, password)) {
                    System.out.println("\nLogin successful!");
                    StudentManagement.studentControl();
                } else {
                    System.out.println("\nInvalid username or password");
                    System.out.println("Try again");
                }

            } else if (choice == 2) {
                System.out.println("Enter your username: ");
                String username = scanner.nextLine();
                System.out.println("Create password: ");
                String password = scanner.nextLine();

                StudentManagement.register(username + "," + password);
                System.out.println("\nRegistration successful!...\n");

            } else if (choice == 3) {
                scanner.close();
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

}
