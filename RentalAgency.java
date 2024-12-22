import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private String name;
        private final List<Vehicle> fleet;

        public RentalAgency(String name) {
            this.name = name;
            this.fleet = new ArrayList<>();
        }

        public void addVehicle(Vehicle vehicle) {
            fleet.add(vehicle);
        }

        public  List<Vehicle> getAvailableVehicle() {
            return fleet.stream().filter(Vehicle::isAvailableForRental).toList();
            }
        public void returnVehicle(String vehicleId, Customer customer, int days) {
            if (!customer.isEligibleForRental()){
                throw new IllegalArgumentException("Customer is not eligible for rental");
            }
        }

    public void processRental(Customer customer, Vehicle vehicle, int days) {
        if (vehicle.isAvailableForRental()) {
            vehicle.rent(customer, days);
            customer.addRental(vehicle);
        }
    }

    public void returnVehicle(Vehicle vehicle, Customer customer) {
        vehicle.returnVehicle();
        customer.returnRental(vehicle);
    }
}



