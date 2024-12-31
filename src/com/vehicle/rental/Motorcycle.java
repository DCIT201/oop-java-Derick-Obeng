package com.vehicle.rental;

public class Motorcycle extends Vehicle implements Rentable {
    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public void rent(Customer customer, int days) throws VehicleNotAvailableException {
        if (isAvailableForRental()) {
            setAvailable(false);
            // Additional logic for renting the motorcycle
        } else {
            throw new VehicleNotAvailableException("Motorcycle is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        // Additional logic for returning the motorcycle
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getBaseRentalRate();
    }
}