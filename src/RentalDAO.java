import java.util.ArrayList;
import java.util.List;

public class RentalDAO {
    private List<Rental> rentals = new ArrayList<>();

    public RentalDAO() {

    }


    public void addRental(Rental rental) {
        rentals.add(rental);
    }


    public Rental getRentalByID(int rentalID) {
        for (Rental rental : rentals) {
            if (rental.getRentalID() == rentalID) {
                return rental;
            }
        }
        return null;
    }

    // Get all rentals
    public List<Rental> getAllRentals() {
        return rentals;
    }
}
