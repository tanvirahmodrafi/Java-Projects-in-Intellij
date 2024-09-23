public class Car extends Vehicle {
    boolean hasAirConditioning;
    Car(String model,String licensePlate,double rentalRatePerDay,boolean hasAirConditioning) {
        super(model,licensePlate,rentalRatePerDay);
        this.hasAirConditioning = hasAirConditioning;
    }
    @Override
    double calculateRentalCost(int rentalDays) {
        if(hasAirConditioning) {
            double cost = rentalDays * rentalRatePerDay;
            cost+=cost*.1;
            return cost;
        }else {
            return rentalDays * rentalRatePerDay;
        }
    }
}
