public class Student {
    String name;
    int age;
    String id;
    Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", ID: " + id;
    }

}
