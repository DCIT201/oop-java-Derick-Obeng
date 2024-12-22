import static jdk.jfr.internal.JVM.isAvailable;

public class Motorcycle extends Vehicle implements Rentable {
        private boolean hasHelmet;

        public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean hasHelmet) {
            super(vehicleId, model, baseRentalRate);
            this.hasHelmet = hasHelmet;
        }

        public boolean hasHelmet() {
            return hasHelmet;
        }


    @Override
    public double calculateRentalRate(int days) {
        return getBaseRentalRate() * days * (hasHelmet ? 1.1 : 1.0);//Helmet increases cost by 10%
    }

    @Override
        public boolean isAvailableForRental() {
            return isAvailable();
        }
    @Override
    public void rent(Customer customer, int days) {
        if (!isAvailableForRental()) {
            throw new IllegalStateException("Vehicle is not available for rental");
        }
        setAvailable(false);
        System.out.println("Vehicle rented to: " + customer.getName());
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Vehicle returned successfully.");
    }

}
