public class Student {
    private String name;
    private int roll_number;
    private String program;
    private int batch;
    Student () {}
    Student (int roll_number, String program){
        this.roll_number = roll_number;
        this.program = program;
    }
    Student (int roll_number, String program, int batch){
        this.roll_number = roll_number;
        this.program = program;
        this.batch = batch;
    }
    Student(String name, int roll_number, String program, int batch) {
        this.name = name;
        this.roll_number = roll_number;
        this.program = program;
        this.batch = batch;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRoll_number() {
        return roll_number;
    }
    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public int getBatch() {
        return batch;
    }
    public void setBatch(int batch) {
        this.batch = batch;
    }

}
