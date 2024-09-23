public class Vehicle {
    String model;
    String licensePlate;
    double rentalRatePerDay;
    boolean isAvailable;

    public Vehicle(String model, String licensePlate, double rentalRatePerDay) {
        this.model = model;
        this.licensePlate = licensePlate;
        this.rentalRatePerDay = rentalRatePerDay;
        this.isAvailable = true;
    }

    double calculateRentalCost(int rentalDays) {
        return rentalRatePerDay * rentalDays;
    }

}
