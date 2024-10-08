import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class StudentManagement {
    static void studentControl(){
        boolean found = false;
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println('\n');
            System.out.println("Press 1 to enter student details :\nPress 2 to find student details :\nPress 3 to add course details :\nPress 4 to view student's course details :\nPress 5 to exit ");

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

                //creating student object.
                Student s = new Student(id,name,program,batch,password,cgpa);

                try {
                    RandomAccessFile Student = new RandomAccessFile("StudentInfo.txt", "rw");
                    Student.seek(Student.length());
                    Student.writeBytes( s.toString()+ "," + password+"\n");
                } catch (Exception e) {
                    System.out.println("Student file not found");
                } finally {
                    System.out.println("Student details successfully added!");
                }

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
                                System.out.println("Name : " + name +
                                        "\nProgram : " + program +
                                        "\nBatch : " + batch +
                                        "\nCGPA : " + cgpa +
                                        "\n--------------------");
                                found = true;
                            }
                        }
                        if(!found){
                            System.out.println("Wrong Student ID");
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
                        System.out.println("Press 1 until your all courses have been added");
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
