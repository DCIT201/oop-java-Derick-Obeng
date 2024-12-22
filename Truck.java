

public class Truck extends Vehicle implements Rentable {
    private boolean longRamp;

    public Truck(String vehicleId, String model, double baseRentalRate, boolean ramp) {
        super(vehicleId, model, baseRentalRate);
        this.longRamp = ramp;
    }
    public boolean longRamp() {
        return longRamp;
    }

    @Override
    public double calculateRentalRate(int days) {
        return getBaseRentalRate() * days + (longRamp ? 1.5 : 1);
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    private boolean isAvailable() {
        return false;
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

