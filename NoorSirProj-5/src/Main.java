import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {
    Students p = new Students("2","adb","43wrnu4","CSE","21",2.4);
    String info = p.getString();

    try {
        RandomAccessFile infoOfStudent = new RandomAccessFile("Studnets.txt","rw");
        infoOfStudent.writeBytes(info);
    }catch (FileNotFoundException ex){
        ex.printStackTrace();
        System.out.println("Studnets.txt not found");
    }catch (IOException ex){
        ex.printStackTrace();
        System.out.println("Studnets.txt not found");
    }

    CoursesInfo s = new CoursesInfo("Rithi","CSE281.4");
    String infoOfCode = s.getCourseinfo();
    try{
        RandomAccessFile raf = new RandomAccessFile("CoursesInfo.txt","rw");
        raf.writeBytes(infoOfCode);
    }catch (FileNotFoundException ex){
        ex.printStackTrace();
        System.out.println("CoursesInfo.txt not found");
    }catch (IOException ex){
        ex.printStackTrace();
        System.out.println("CoursesInfo.txt not found");
    }
    System.out.println(s.readFile("Rithi"));

    }

}