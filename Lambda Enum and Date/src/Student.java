import java.time.LocalDate;

public class Student {
    private String name;
    private int id;
    private double cgpa;
    private LocalDate dateOfBirth;
    private Gender gender;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int id, double cgpa, LocalDate dateOfBirth) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
