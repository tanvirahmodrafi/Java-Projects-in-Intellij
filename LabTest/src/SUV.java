public class SUV extends Vehicle {
    boolean hasFourWheelDrive;

    public SUV(String model, String licensePlate, double rentalRatePerDay,boolean hasFourWheelDrive) {
        super(model, licensePlate, rentalRatePerDay);
        this.hasFourWheelDrive = hasFourWheelDrive;

    }
    @Override
    double calculateRentalCost(int rentalDays) {
        if(hasFourWheelDrive){
            return (rentalDays * rentalRatePerDay)+20 ;
        }else{
            return (rentalDays * rentalRatePerDay);
        }
    }
}
