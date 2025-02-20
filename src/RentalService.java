import java.util.Scanner;

public class RentalService {
    private RentalDAO rentalDAO = new RentalDAO();  // Initialize RentalDAO
    private Scanner scanner = new Scanner(System.in);

    public void createRentalContract() {
        System.out.print("Indtast lejeaftalens ID: ");
        int rentalID = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        System.out.print("Indtast kundens ID (renter): ");
        int customerID = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        System.out.print("Indtast bilens registreringsnummer (plate): ");
        String registrationNumber = scanner.nextLine();

        System.out.print("Indtast startdato og tid (YYYY-MM-DD HH:MM): ");
        String fromDate = scanner.nextLine();

        System.out.print("Indtast slutdato og tid (YYYY-MM-DD HH:MM): ");
        String toDate = scanner.nextLine();

        System.out.print("Indtast max km: ");
        int maxKm = scanner.nextInt();

        System.out.print("Indtast start km (odometer): ");
        int startKm = scanner.nextInt();

        // Create rental object
        Rental rental = new Rental(rentalID, customerID, fromDate, toDate, maxKm, startKm, registrationNumber);

        // Add rental to DAO (database)
        rentalDAO.addRental(rental);

        System.out.println("Lejeaftalen er oprettet!");
    }

    // Optional method to list all rentals (for debugging or verification)
    public void listAllRentals() {
        System.out.println("Alle lejeaftaler:");
        for (Rental rental : rentalDAO.getAllRentals()) {
            System.out.println(rental);
        }
    }
}
