package com.vehicle.rental;

public class Car extends Vehicle implements Rentable {
    public Car(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public void rent(Customer customer, int days) throws VehicleNotAvailableException {
        if (isAvailableForRental()) {
            setAvailable(false);
            // Additional logic for renting the car
        } else {
            throw new VehicleNotAvailableException("Car is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        // Additional logic for returning the car
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getBaseRentalRate();
    }
}