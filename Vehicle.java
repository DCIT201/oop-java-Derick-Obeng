public abstract class Vehicle {
    // Encapsulation
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    // Constructors
    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;

    }

    //Getters and Setters
    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        if (vehicleId == null || vehicleId.isEmpty()) {
            throw new IllegalArgumentException("Vehicle id cannot be empty");
        }
        this.vehicleId = vehicleId;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if ( model == null || model.isEmpty() ) {
            throw new IllegalArgumentException("Model needed");
        }
        this.model = model;
    }
    public double getBaseRentalRate() {
        return baseRentalRate;
    }
    public void setBaseRentalRate(double baseRentalRate) {
        if( baseRentalRate <=0 || baseRentalRate > 1 ) {
            throw new IllegalArgumentException("Inavlid baseRentalRate");
        }
        this.baseRentalRate = baseRentalRate;
    }
    public boolean getAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = isAvailable;
    }
    //Abstract Method
    public abstract double calculateRentalRate(int days);

    public abstract boolean isAvailableForRental();

    public void returnVehicle() {
    }

    public void rent(Customer customer ,int days) {
    }
}
