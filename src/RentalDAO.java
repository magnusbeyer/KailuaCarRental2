import java.util.ArrayList;
import java.util.List;

public class RentalDAO {
    private List<Rental> rentals = new ArrayList<>();

    // Constructor to initialize with some data
    public RentalDAO() {
        // Adding some initial data for testing
    }

    // Add a rental contract to the list (simulating a database insert)
    public void addRental(Rental rental) {
        rentals.add(rental);  // Add the rental to the list
    }

    // Get rental by ID
    public Rental getRentalByID(int rentalID) {
        for (Rental rental : rentals) {
            if (rental.getRentalID() == rentalID) {
                return rental;
            }
        }
        return null;  // Return null if rental is not found
    }

    // Get all rentals
    public List<Rental> getAllRentals() {
        return rentals;
    }
}
