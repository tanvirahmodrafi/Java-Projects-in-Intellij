import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

                if (login(username, password)) {
                    System.out.println("Login successful!");
                    studentControl();
                } else {
                    System.out.println("Invalid username or password");
                    System.out.println("Try again");
                }

            } else if (choice == 2) {
                System.out.println("Enter your username: ");
                String username = scanner.nextLine();
                System.out.println("Create password: ");
                String password = scanner.nextLine();

                register(username + "," + password);
                System.out.println("Registration successful!");

            } else if (choice == 3) {
                scanner.close();
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }



    static void studentControl(){
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press 1 to enter student details :\nPress 2 to find student details :\nPress 3 to add course details :\nPress 4 to view student details :\nPress 5 to exit ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 1){
                System.out.println("Enter student id: ");
                String id = scanner.nextLine();
                System.out.println("Enter student name: ");
                String name = scanner.nextLine();
                System.out.println("Enter student's program: ");
                String program = scanner.nextLine();
                System.out.println("Enter student's batch: ");
                String batch = scanner.nextLine();
                System.out.println("Enter student password: ");
                String password = scanner.nextLine();
                System.out.println("Enter student CGPA: ");
                String cgpa = scanner.nextLine();
                try {
                    RandomAccessFile Student = new RandomAccessFile("StudentInfo.txt", "rw");
                    Student.seek(Student.length());
                    Student.writeBytes(id + "," + name + "," + program + "," + batch + "," + cgpa + "," + password+"\n");
                } catch (Exception e) {
                    System.out.println("Student file not found");
                }
                System.out.println("Student details successfully added!");
            }else if(choice == 2){
                System.out.println("Enter student id: ");
                String id = scanner.nextLine();
                if(studentInfoToView(id)){
                    try (RandomAccessFile auth = new RandomAccessFile("StudentInfo.txt", "r")) {
                        String line;
                        while ((line = auth.readLine()) != null) {
                            String[] info = line.split(",");
                            String userId = info[0];
                            String name = info[1];
                            String program = info[2];
                            String batch = info[3];
                            String cgpa = info[4];

                            if (Objects.equals(userId, id)) {
                                System.out.println("Name : " + name + "\nProgram : " + program + "\nBatch : " + batch + "\nCGPA : " + cgpa);
                            }
                        }
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                        System.out.println("UserIdAuthorization.txt not found");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        System.out.println("Error reading from UserIdAuthorization.txt");
                    }
                }

            } else if (choice == 3) {
                System.out.println("Adding course details to student");
                System.out.println("Enter student id: ");
                String id = scanner.nextLine();
                if (studentInfoToView(id)) {
                    try {
                        RandomAccessFile courses = new RandomAccessFile("CourseInfo.txt", "rw");
                        courses.seek(courses.length());
                        courses.writeBytes(id + ",");

                        while (true) {
                            System.out.println("Press 1 to Enter Course Code: \nPress 2 to exit: ");
                            int choice1 = scanner.nextInt();
                            scanner.nextLine();

                            if (choice1 == 1) {
                                System.out.println("Enter Course Code: ");
                                String code = scanner.nextLine();
                                courses.writeBytes(code + ",");
                            } else {
                                courses.writeBytes("\n");  // End the line when exiting
                                System.out.println("Course details successfully added!");
                                break;
                            }
                        }
                        courses.close();
                    } catch (Exception e) {
                        System.out.println("Course file not found");
                    }
                } else {
                    System.out.println("Student details not found");
                }
        }else if(choice == 4){
                System.out.println("Showing course details");
                System.out.println("Enter student id: ");
                String id = scanner.nextLine();
                if(studentInfoToView(id)){
                    try (RandomAccessFile courses = new RandomAccessFile("CourseInfo.txt", "r")) {
                        String line;
                        while ((line = courses.readLine()) != null) {
                            String[] info = line.split(",");

                            String userId = info[0];

                            if (Objects.equals(userId, id)) {
                                int i = 1;
                                while (i < info.length) {
                                    System.out.println(info[i]+" ");
                                    i++;
                                }
                            }
                        }
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                        System.out.println("UserIdAuthorization.txt not found");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        System.out.println("Error reading from UserIdAuthorization.txt");
                    }
                }
            }
            else{
                break;
            }
        }
    }



    static boolean studentInfoToView(String id){
        try (RandomAccessFile auth = new RandomAccessFile("StudentInfo.txt", "r")) {
            String line;
            while ((line = auth.readLine()) != null) {
                String[] info = line.split(",");
                String userId = info[0];

                if (Objects.equals(userId, id)) {
                    return true;
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("UserIdAuthorization.txt not found");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error reading from UserIdAuthorization.txt");
        }

        return false;
    }



    static boolean login(String username, String pass) {
        try (RandomAccessFile auth = new RandomAccessFile("UserIdAuthorization.txt", "r")) {
            String line;
            while ((line = auth.readLine()) != null) {
                String[] info = line.split(",");
                String userId = info[0];
                String password = info[1];
                if (Objects.equals(userId, username) && password.equals(pass)) {
                    return true;
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("UserIdAuthorization.txt not found");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error reading from UserIdAuthorization.txt");
        }
        return false;
    }



    static void register(String usernameAndPassword) {
        try (RandomAccessFile registration = new RandomAccessFile("UserIdAuthorization.txt", "rw")) {
            registration.seek(registration.length());
            registration.writeBytes(usernameAndPassword + "\n");
        } catch (Exception e) {
            System.out.println("Error during registration");
            e.printStackTrace();
        }
    }
}
