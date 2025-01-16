package com.vehicle.rental;

public class Main {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("C001", "Alice");
        customer1.earnPoints(50);
        System.out.println("Customer Loyalty Points: " + customer1.getPoints());

        // Redeem points
        customer1.redeemPoints(30);
        System.out.println("Points after redemption: " + customer1.getPoints());

        // Create a car and test rental
        Vehicle car = new Car("V001", "Toyota Corolla", 50.0);

        try {
            car.rent(customer1, 5); // Assuming rent method requires customer and days
            System.out.println("Car rented successfully.");
        } catch (VehicleNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        // Add ratings
        car.addRating(5.0);
        car.addRating(4.0);
        System.out.println("Car Average Rating: " + car.getAverageRating());

        customer1.addRating(4.5);
        System.out.println("Customer Average Rating: " + customer1.getAverageRating());
    }
}