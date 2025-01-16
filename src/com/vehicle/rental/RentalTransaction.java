package com.vehicle.rental;

import java.util.Date;

public class RentalTransaction {
    private String transactionId;
    private Date rentalDate;
    private Date returnDate;
    private Vehicle rentedVehicle;

    public RentalTransaction(String transactionId, Date rentalDate, Vehicle rentedVehicle) {
        this.transactionId = transactionId;
        this.rentalDate = rentalDate;
        this.rentedVehicle = rentedVehicle;
        this.returnDate = null;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public Vehicle getRentedVehicle() {
        return rentedVehicle;
    }

    public String getTransactionId() {
        return transactionId;
    }
}
