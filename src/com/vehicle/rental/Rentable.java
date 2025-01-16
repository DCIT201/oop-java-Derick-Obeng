package com.vehicle.rental;

public interface Rentable {
    void rent(Customer customer, int days) throws VehicleNotAvailableException;
    void returnVehicle();
}