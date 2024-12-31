package com.vehicle.rental;

public class Truck extends Vehicle implements Rentable {
    private double loadCapacity;

    public Truck(String vehicleId, String model, double baseRentalRate, double loadCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getBaseRentalRate() + (loadCapacity * 10);
    }

    @Override
    public void rent(Customer customer, int days) throws VehicleNotAvailableException {
        if (isAvailableForRental()) {
            setAvailable(false);
            // Additional logic for renting the truck
        } else {
            throw new VehicleNotAvailableException("Truck is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        // Additional logic for returning the truck
    }
}