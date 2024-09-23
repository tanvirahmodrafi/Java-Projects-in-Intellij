//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Customer c1 = new Customer("John Smith","D12345");
    Car cam = new Car("Toyota Camry","XYZ123",50,true);
    c1.rentVehicle(cam,5);

    Customer c3 = new Customer("Mike Johnson", "D67890");
    Motorcycle har = new Motorcycle("Harley Davidson","MC789",40,650);
    c3.rentVehicle(har,4);

    Customer c2 = new Customer("Emily Davis", "D98765");
    SUV ford = new SUV("Ford Explorer", "SUV456", 70, true);
    c2.rentVehicle(ford,3);
    c2.returnRentedVehicle();
    System.out.println(c2.rentedVehicle.model);

    }
}