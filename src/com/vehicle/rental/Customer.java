package com.vehicle.rental;

import java.util.ArrayList;
import java.util.List;

public class Customer implements LoyaltyProgram, RatingSystem {
    private String customerId;
    private String name;
    private int loyaltyPoints;
    private List<RentalTransaction> rentalHistory;
    private List<Double> ratings;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.loyaltyPoints = 0;
        this.rentalHistory = new ArrayList<>();
        this.ratings = new ArrayList<>();
    }

    // Loyalty Program Implementation
    @Override
    public void earnPoints(int points) {
        this.loyaltyPoints += points;
    }

    @Override
    public int redeemPoints(int points) {
        if (points <= loyaltyPoints) {
            loyaltyPoints -= points;
            return points;
        } else {
            System.out.println("Not enough points to redeem.");
            return 0;
        }
    }

    @Override
    public int getPoints() {
        return loyaltyPoints;
    }

    // Rating System Implementation
    @Override
    public void addRating(double rating) {
        ratings.add(rating);
    }

    @Override
    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double rating : ratings) {
            sum += rating;
        }
        return sum / ratings.size();
    }

    // Additional Methods
    public void addRentalTransaction(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }

    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }
}