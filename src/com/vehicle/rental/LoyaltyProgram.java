package com.vehicle.rental;

public interface LoyaltyProgram {
    void earnPoints(int points);
    int redeemPoints(int points);
    int getPoints();
}
