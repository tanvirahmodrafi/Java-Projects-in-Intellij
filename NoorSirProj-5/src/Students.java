public class Students {
    private String id;
    private String name;
    private String password;
    private String program;
    private String batch;
    private double cgpa;

    public Students(String id, String name, String password, String program, String batch, double cgpa) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.program = program;
        this.batch = batch;
        this.cgpa = cgpa;
    }
    public String getString(){
        return id+","+name+","+password+","+program+","+batch+","+cgpa;
    }
}
