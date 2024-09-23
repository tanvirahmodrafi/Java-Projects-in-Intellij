import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CoursesInfo {
    private String studentId;
    private String courseCode;

    CoursesInfo(String studentId, String courseCode) {
        this.studentId = studentId;
        this.courseCode = courseCode;
    }

    public String getCourseinfo() {
        return studentId + "," + courseCode;
    }

    static boolean readFile(String studentName) {
        try {
            RandomAccessFile r = new RandomAccessFile("CoursesInfo.txt", "r");
            String line;
            while ((line = r.readLine()) != null) {
                String[] info = line.split(",");
                String name = info[0];
                String course = info[1];
                if (studentName.equals(name)) {
                    System.out.println(course);
                    return true;
                }
            }
            r.close(); // Close the file after reading
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("CoursesInfo.txt not found");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error reading from CoursesInfo.txt");
        }
        return false;
    }

}
