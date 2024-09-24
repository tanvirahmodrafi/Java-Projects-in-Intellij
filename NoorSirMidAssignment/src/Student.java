import static java.lang.Character.isDigit;

public class Student {
    private String StudentId;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String email;
    private String phone;
    private String religion;
    private String major;
    private int batch;
    private String password;

    Student(){ // This constructor assign empty value for the object. I have just created an object without anything inside.
        this.StudentId = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.gender = "";
        this.email = "";
        this.phone = "";
        this.religion = "";
        this.major = "";
        this.batch = 0;
        this.password = "";
    }

    Student(String StudentId,String firstName,String lastName, int batch,String gender,String email,String phone,String religion,String major,int age,String password){
        //This constructor is used to assign all the values to the class.
        this.StudentId = StudentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.phone = phone;
        this.religion = religion;
        this.major = major;
        this.batch = batch;
        this.password = password;

        if(!validAlfa(getFirstName(),getLastName())){
            System.out.println("invalid input");
        }
        if(!validNum(StudentId,phone)){
            System.out.println("invalid input");
        }
    }

    Student(String firstName,String lastname, int age,String phone, String gender){
        // this constructor is made to assign the basic information about the student
        // this could be used by the admission office form
        this.firstName = firstName;
        this.lastName = lastname;
        this.age = age;
        this.phone = phone;
        this.gender = gender;

        if(!validAlfa(getFirstName(),getLastName())){
            System.out.println("invalid input");
        }
        if(!validNum(getPhone())){
            System.out.println("invalid input");
        }
    }

    Student(String StudentId,String password){
        // this will only be used only by the tech team
        this.StudentId = StudentId;
        this.password = password;

        if(!validNum(StudentId)){
            System.out.println("invalid input");
        }
    }

    String getStudentId(){
        return StudentId;
    }
    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
    int getAge(){
        return age;
    }
    String getGender(){
        return gender;
    }
    String getEmail(){
        return email;
    }
    String getPhone(){
        return phone;
    }
    boolean validNum(String... num){
        for(String x : num){
            String info = x;
            for(int i = info.length()-1; i >= 0; i--){
                if(!isDigit(info.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }

    boolean validAlfa(String... alfa){
        for(String x : alfa){
            String info = x;
            for(int i = info.length()-1; i >= 0; i--){
                if(isDigit(info.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }
}
