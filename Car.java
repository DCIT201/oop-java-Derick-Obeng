public class Car extends Vehicle implements Rentable {
    private boolean hasGPS;
    private boolean available;

    public Car(String vehicleId , String model, double baseRentalRate, boolean hasGPS) {
        super(vehicleId, model, baseRentalRate);
        this.hasGPS = hasGPS;
    }
    public boolean hasGPS() {
        return hasGPS;
    }

    @Override
    public double calculateRentalRate(int days) {
        return getBaseRentalRate() * days * (hasGPS ? 5 : 1);

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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
