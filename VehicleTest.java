import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class VehicleTest {
        @Test
        public void testCarRentalCost() {
            Car car = new Car("C123", "Toyota Camry", 50, true);
            car.setAvailable(false);
            assertFalse(car.isAvailable());
        }

        @Test
        public void testTruckAvailability() {
            Truck truck = new Truck("T456", "Ford F-150", 100, true);
            truck.setAvailable(false);
            assertFalse(truck.isAvailableForRental());
        }
    }

