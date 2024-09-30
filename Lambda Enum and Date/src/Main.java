import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("rafi",231,3.56,LocalDate.of(2004,3,10));
        Student s2 = new Student("rafia",21,3.5,LocalDate.of(2001,3,1));
        System.out.println(s1.getDateOfBirth().getDayOfWeek());
        s1.setGender(Gender.male);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        List<Student> filterStudent= students.stream().filter(s -> s.getCgpa()>3).toList();
        double sumOfCgpa = students.stream().filter(s -> s.getCgpa()>3).mapToDouble(s -> s.getCgpa()).sum();
        System.out.println(sumOfCgpa);



    }
}