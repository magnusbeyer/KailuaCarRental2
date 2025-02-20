import java.util.Scanner;

public class RentalService {
    private RentalDAO rentalDAO = new RentalDAO();
    private Scanner scanner = new Scanner(System.in);

    public void createRentalContract() {
        System.out.print("Indtast lejeaftalens ID: ");
        int rentalID = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Indtast kundens ID (renter): ");
        int customerID = scanner.nextInt();
        scanner.nextLine();

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

        Rental rental = new Rental(rentalID, customerID, fromDate, toDate, maxKm, startKm, registrationNumber);

        rentalDAO.addRental(rental);

        System.out.println("Lejeaftalen er oprettet!");
    }

    public void listAllRentals() {
        System.out.println("Alle lejeaftaler:");
        for (Rental rental : rentalDAO.getAllRentals()) {
            System.out.println(rental);
        }
    }
}
