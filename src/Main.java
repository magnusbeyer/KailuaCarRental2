import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();
        CustomerService customerService = new CustomerService();
        RentalService rentalService = new RentalService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Menu for brugerinteraktion
            System.out.println("\n*************** Kailua CarRental System ***************");
            System.out.println("Vælg en handling:");
            System.out.println("1. Vis alle biler");
            System.out.println("2. Vis alle kunder");
            System.out.println("3. Tilføj ny bil");
            System.out.println("4. Tilføj ny kunde");
            System.out.println("5. Opret lejeaftale");
            System.out.println("6. Opdater bilinformation");
            System.out.println("7. Opdater kundeinformation");
            System.out.println("8. Afslut");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    carService.showAllCars();
                    break;
                case 2:
                    customerService.showAllCustomers();
                    break;
                case 3:
                    carService.addNewCar();
                    break;
                case 4:
                    customerService.addNewCustomer();
                    break;
                case 5:
                    break;
                case 6:
                    carService.updateCarInfo();
                    break;
                case 7:
                    customerService.updateCustomerInfo();
                    break;
                case 8:
                    System.out.println("Afslutter programmet...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ugyldigt valg, prøv igen.");
            }
        }
    }
}
