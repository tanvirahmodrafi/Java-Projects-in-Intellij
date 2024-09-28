public class Student {
    private String name;
    private String studentID;
    private String program;
    private String batch;
    private String password;
    private String cgpa;
    public Student( String studentID,String name, String program, String batch, String password, String cgpa) {
        this.name = name;
        this.studentID = studentID;
        this.program = program;
        this.batch = batch;
        this.password = password;
        this.cgpa = cgpa;
    }
    public String getName() {
        return name;
    }
    public String getStudentID() {
        return studentID;
    }
    public String getProgram() {
        return program;
    }
    public String getBatch() {
        return batch;
    }
    public String getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return getStudentID() +","+getName()+","+ getProgram()+","+getBatch()+","+getCgpa();
    }
}
