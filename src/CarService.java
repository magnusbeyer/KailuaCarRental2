import java.util.List;
import java.util.Scanner;

public class CarService {
    private CarDAO carDAO = new CarDAO();
    private Scanner scanner = new Scanner(System.in);

    // Vis alle biler
    public void showAllCars() {
        List<Car> cars = carDAO.getAllCars();
        System.out.println("************** BILER I UDBUD **************");
        if (cars.isEmpty()) {
            System.out.println("Ingen biler tilgængelige.");
        } else {
            for (Car car : cars) {
                System.out.println("--------------------------------------------");
                System.out.println("Bil ID: " + car.getCarID());
                System.out.println("Mærke: " + car.getBrand());
                System.out.println("Model: " + car.getModel());
                System.out.println("Brændstof: " + car.getFuelType());
                System.out.println("Registreringsnummer: " + car.getRegistrationNumber());
                System.out.println("Første registrering: " + car.getFirstRegistration());
                System.out.println("Kilometerstand: " + car.getOdometer() + " km");
                System.out.println("Kategori: " + car.getCategory());
                System.out.println("--------------------------------------------");
            }
        }
    }

    // Tilføj ny bil
    public void addNewCar() {
        System.out.println("Indtast bilinformation:");
        System.out.print("Mærke: ");
        String brand = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Brændstoftype: ");
        String fuelType = scanner.nextLine();
        System.out.print("Registreringsnummer: ");
        String registrationNumber = scanner.nextLine();
        System.out.print("Første registrering (ÅÅÅÅ-MM): ");
        String firstRegistration = scanner.nextLine();
        System.out.print("Kilometerstand: ");
        int odometer = scanner.nextInt();
        scanner.nextLine();  // For at spise newline
        System.out.print("Kategori (Luxury/Family/Sport): ");
        String category = scanner.nextLine();

        // Opret bil og gem i databasen
        Car newCar = new Car(0, brand, model, fuelType, registrationNumber, firstRegistration, odometer, category);
        carDAO.addCar(newCar);
        System.out.println("Ny bil tilføjet!");
    }


    public void updateCarInfo() {
        System.out.print("Indtast bilens ID for opdatering: ");
        int carID = scanner.nextInt();
        scanner.nextLine();  // For at spise newline
        Car car = carDAO.getCarByID(carID);

        if (car == null) {
            System.out.println("Ingen bil fundet med det ID.");
            return;
        }

        System.out.println("Opdater bilinformation for: " + car.getBrand() + " " + car.getModel());
        System.out.print("Ny kilometerstand: ");
        int newOdometer = scanner.nextInt();
        scanner.nextLine();
        car.setOdometer(newOdometer);
        carDAO.updateCar(car);
        System.out.println("Bilens kilometerstand er blevet opdateret.");
    }
}
