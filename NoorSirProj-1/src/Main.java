public class Main {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        Rectangle rect3 = new Rectangle();
        Rectangle rect4 = new Rectangle();
        Rectangle rect5 = new Rectangle();

        rect1.setLength(5.0);
        rect1.setWidth(3.0);
        rect2.setLength(6.0);
        rect2.setWidth(4.0);
        rect3.setLength(7.0);
        rect3.setWidth(5.0);
        rect4.setLength(8.0);
        rect4.setWidth(6.0);
        rect5.setLength(9.0);
        rect5.setWidth(7.0);

        System.out.println("Rectangle 1: Length = " + rect1.getLength() + ", Width = " + rect1.getWidth());
        System.out.println("Rectangle 2: Length = " + rect2.getLength() + ", Width = " + rect2.getWidth());
        System.out.println("Rectangle 3: Length = " + rect3.getLength() + ", Width = " + rect3.getWidth());
        System.out.println("Rectangle 4: Length = " + rect4.getLength() + ", Width = " + rect4.getWidth());
        System.out.println("Rectangle 5: Length = " + rect5.getLength() + ", Width = " + rect5.getWidth());

        // Create and manipulate Circle objects
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();
        Circle circle5 = new Circle();

        circle1.setRadius(2.0);
        circle2.setRadius(3.0);
        circle3.setRadius(4.0);
        circle4.setRadius(5.0);
        circle5.setRadius(6.0);

        System.out.println("Circle 1: Radius = " + circle1.getRadius());
        System.out.println("Circle 2: Radius = " + circle2.getRadius());
        System.out.println("Circle 3: Radius = " + circle3.getRadius());
        System.out.println("Circle 4: Radius = " + circle4.getRadius());
        System.out.println("Circle 5: Radius = " + circle5.getRadius());

        // Create and manipulate Car objects
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setBrand("Toyota");
        car1.setModel("Corolla");
        car1.setYear(2020);
        car2.setBrand("Honda");
        car2.setModel("Civic");
        car2.setYear(2019);
        car3.setBrand("Ford");
        car3.setModel("Mustang");
        car3.setYear(2021);
        car4.setBrand("Chevrolet");
        car4.setModel("Camaro");
        car4.setYear(2018);
        car5.setBrand("Tesla");
        car5.setModel("Model S");
        car5.setYear(2022);

        System.out.println("Car 1: Brand = " + car1.getBrand() + ", Model = " + car1.getModel() + ", Year = " + car1.getYear());
        System.out.println("Car 2: Brand = " + car2.getBrand() + ", Model = " + car2.getModel() + ", Year = " + car2.getYear());
        System.out.println("Car 3: Brand = " + car3.getBrand() + ", Model = " + car3.getModel() + ", Year = " + car3.getYear());
        System.out.println("Car 4: Brand = " + car4.getBrand() + ", Model = " + car4.getModel() + ", Year = " + car4.getYear());
        System.out.println("Car 5: Brand = " + car5.getBrand() + ", Model = " + car5.getModel() + ", Year = " + car5.getYear());

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();
        Employee emp5 = new Employee();

        emp1.setName("Alice");
        emp1.setAge(30);
        emp1.setSalary(50000);
        emp2.setName("Bob");
        emp2.setAge(25);
        emp2.setSalary(45000);
        emp3.setName("Charlie");
        emp3.setAge(35);
        emp3.setSalary(55000);
        emp4.setName("David");
        emp4.setAge(28);
        emp4.setSalary(48000);
        emp5.setName("Eve");
        emp5.setAge(32);
        emp5.setSalary(52000);

        System.out.println("Employee 1: Name = " + emp1.getName() + ", Age = " + emp1.getAge() + ", Salary = $" + emp1.getSalary());
        System.out.println("Employee 2: Name = " + emp2.getName() + ", Age = " + emp2.getAge() + ", Salary = $" + emp2.getSalary());
        System.out.println("Employee 3: Name = " + emp3.getName() + ", Age = " + emp3.getAge() + ", Salary = $" + emp3.getSalary());
        System.out.println("Employee 4: Name = " + emp4.getName() + ", Age = " + emp4.getAge() + ", Salary = $" + emp4.getSalary());
        System.out.println("Employee 5: Name = " + emp5.getName() + ", Age = " + emp5.getAge() + ", Salary = $" + emp5.getSalary());

        // Create and manipulate Student objects
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        student1.setName("John");
        student1.setRoll_number(101);
        student1.setProgram("Computer Science");
        student1.setBatch(2023);
        student2.setName("Jane");
        student2.setRoll_number(102);
        student2.setProgram("Electrical Engineering");
        student2.setBatch(2022);
        student3.setName("Mike");
        student3.setRoll_number(103);
        student3.setProgram("Mechanical Engineering");
        student3.setBatch(2024);
        student4.setName("Sara");
        student4.setRoll_number(104);
        student4.setProgram("Civil Engineering");
        student4.setBatch(2021);
        student5.setName("Anna");
        student5.setRoll_number(105);
        student5.setProgram("Biotechnology");
        student5.setBatch(2023);

        System.out.println("Student 1: Name = " + student1.getName() + ", Roll Number = " + student1.getRoll_number() + ", Program = " + student1.getProgram() + ", Batch = " + student1.getBatch());
        System.out.println("Student 2: Name = " + student2.getName() + ", Roll Number = " + student2.getRoll_number() + ", Program = " + student2.getProgram() + ", Batch = " + student2.getBatch());
        System.out.println("Student 3: Name = " + student3.getName() + ", Roll Number = " + student3.getRoll_number() + ", Program = " + student3.getProgram() + ", Batch = " + student3.getBatch());
        System.out.println("Student 4: Name = " + student4.getName() + ", Roll Number = " + student4.getRoll_number() + ", Program = " + student4.getProgram() + ", Batch = " + student4.getBatch());
        System.out.println("Student 5: Name = " + student5.getName() + ", Roll Number = " + student5.getRoll_number() + ", Program = " + student5.getProgram() + ", Batch = " + student5.getBatch());

    }
}
