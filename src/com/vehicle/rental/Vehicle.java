package com.vehicle.rental;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;
    private List<Double> ratings;

    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;
        this.ratings = new ArrayList<>();
    }

    public String getModel() {
        return model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public boolean isAvailableForRental() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void addRating(double rating) {
        if (rating >= 1 && rating <= 5) {
            ratings.add(rating);
        }
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) return 0;
        return ratings.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    public abstract double calculateRentalCost(int days);

    public abstract void rent(Customer customer, int days) throws VehicleNotAvailableException;
}