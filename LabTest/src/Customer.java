public class Customer {
    String name;
    String driverLicenseNumber;
    Vehicle rentedVehicle;
    public Customer(String name, String driverLicenseNumber) {
        this.name = name;
        this.driverLicenseNumber = driverLicenseNumber;
        rentedVehicle = null;

    }
    void rentVehicle(Vehicle vehicle, int rentalDays){
        if(rentedVehicle == null){
            if(vehicle.isAvailable){
            vehicle.isAvailable = false;
            rentedVehicle= vehicle;
            System.out.println(vehicle.calculateRentalCost(rentalDays));
            }else{
            System.out.println("Vehicle is not available");
            }
        }else{
            System.out.println("Already Rented");
        }
    }
    void returnRentedVehicle(){
        if(rentedVehicle == null){
            System.out.println("Not rented any Vehicle");
        }else{
            rentedVehicle = null;
        }
    }
}
