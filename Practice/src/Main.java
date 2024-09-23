import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String studentInfo = "Ahmod,21,19\n";

        writeFile(studentInfo);
        readFile();

    }

    static void writeFile(String inp){
        try{
            RandomAccessFile raf = new RandomAccessFile("Student.txt","rw");
            raf.seek(raf.length());
            raf.writeBytes(inp);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    static void readFile(){
        List<Student> students = new ArrayList<>();

        try{
            RandomAccessFile raf = new RandomAccessFile("Student.txt","rw");
            String read;
            while((read = raf.readLine())!= null){
                Scanner s = new Scanner(System.in);
               String []arr = read.split(",");
               String name = arr[0];
               int age = Integer.parseInt(arr[1]);
               String id = arr[2];

               Student su = new Student(name, age, id);
               students.add(su);
            }
            for (Student s : students){
                System.out.println(s);
            }
            raf.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }


}