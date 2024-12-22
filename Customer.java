import java.util.ArrayList;
import java.util.List;
public class Customer {
    private String customerID;
    private String name;
    private int age;
    private String driverLicenseNumber;
    private List<Vehicle> currentRentals;
    private ArrayList<Vehicle> rentalHistory;
    private boolean hasDues;


    public Customer(String name, String customerID, int age, String driverLicenseNumber) {
        this.name = name;
        this.customerID = customerID;
        this.age = age;
        this.driverLicenseNumber = driverLicenseNumber;
        this.currentRentals = new ArrayList<>();
        this.rentalHistory = new ArrayList<Vehicle>();
        this.hasDues = false;


    }
    public String getName() {
        return name;
    }
    public String getCustomerID() {
        return customerID;
    }
    public int getAge() {
        return age;
    }
    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }
    public List<Vehicle> getCurrentRentals() {
        return currentRentals;
    }
    public boolean hasDues() {
        return hasDues;
    }
    public void setDues(boolean hasDues) {
        this.hasDues = hasDues;
    }

    public void addRental(Vehicle vehicle) {
        rentalHistory.add(vehicle);
        currentRentals.add(vehicle);

    }
    public void removeRental(Vehicle vehicle) {
        rentalHistory.remove(vehicle);
    }
    public boolean isEligibleForRental() {
        return age >= 18 && !hasDues && !hasHistoryOfLateReturnOrDamage();

    }
    public ArrayList<Vehicle> getRentalHistory() {
        return rentalHistory;
    }
    private boolean hasHistoryOfLateReturnOrDamage(){
        return false;
    }

    public void returnRental(Vehicle vehicle) {
    }


}