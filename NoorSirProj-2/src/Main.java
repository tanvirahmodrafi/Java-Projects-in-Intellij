//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rithi", 23, 50000);
        System.out.println("Name: " + emp1.getName());
        System.out.println("Age: " + emp1.getAge());
        System.out.println("Salary: $" + emp1.getSalary());

    }
}