public class Motorcycle extends Vehicle {
    int engineCapacity;

    public Motorcycle(String model, String licensePlate, double rentalRatePerDay, int engineCapacity) {
        super(model, licensePlate, rentalRatePerDay);
        this.engineCapacity = engineCapacity;
    }
    @Override
    double calculateRentalCost(int rentalDays) {
        if(engineCapacity > 600){
            return (rentalRatePerDay*rentalDays) + 15;
        }else {
            return rentalRatePerDay*rentalDays;
        }
    }
}
