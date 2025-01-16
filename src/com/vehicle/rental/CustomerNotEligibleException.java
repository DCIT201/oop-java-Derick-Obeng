package com.vehicle.rental;

public class CustomerNotEligibleException extends Exception {
    public CustomerNotEligibleException(String message) {
        super(message);
    }
}
