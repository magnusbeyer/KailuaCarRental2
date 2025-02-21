import java.util.List;
import java.util.Scanner;

public class CustomerService {
    private CustomerDAO customerDAO = new CustomerDAO();
    private Scanner scanner = new Scanner(System.in);

    public void showAllCustomers() {
        List<Customer> customers = customerDAO.getAllCustomers();
        System.out.println("************** KUNDER **************");
        if (customers.isEmpty()) {
            System.out.println("Ingen kunder registreret.");
        } else {
            for (Customer customer : customers) {
                System.out.println("--------------------------------------------");
                System.out.println("Kunde ID: " + customer.getCustomerID());
                System.out.println("Navn: " + customer.getName());
                System.out.println("Adresse: " + customer.getAddress());
                System.out.println("Postnummer: " + customer.getZip());
                System.out.println("By: " + customer.getCity());
                System.out.println("Mobiltelefon: " + customer.getMobilePhone());
                System.out.println("Telefon: " + customer.getPhone());
                System.out.println("Email: " + customer.getEmail());
                System.out.println("--------------------------------------------");
            }
        }
    }


    public void addNewCustomer() {
        System.out.println("Indtast kundens information:");
        System.out.print("Navn: ");
        String name = scanner.nextLine();
        System.out.print("Adresse: ");
        String address = scanner.nextLine();
        System.out.print("Postnummer: ");
        String zip = scanner.nextLine();
        System.out.print("By: ");
        String city = scanner.nextLine();
        System.out.print("Mobiltelefon: ");
        String mobilePhone = scanner.nextLine();
        System.out.print("Telefon: ");
        String phone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Kørekortnummer: ");
        String driverLicenceNumber = scanner.nextLine();
        System.out.print("Første kørekortdato (ÅÅÅÅ-MM-DD): ");
        String driverSince = scanner.nextLine();

        Customer newCustomer = new Customer(0, name, address, zip, city, mobilePhone, phone, email, driverLicenceNumber, driverSince);
        customerDAO.addCustomer(newCustomer);
        System.out.println("Ny kunde tilføjet!");
    }

    public void updateCustomerInfo() {
        System.out.print("Indtast kundens ID for opdatering: ");
        int customerID = scanner.nextInt();
        scanner.nextLine();
        Customer customer = customerDAO.getCustomerByID(customerID);

        if (customer == null) {
            System.out.println("Ingen kunde fundet med det ID.");
            return;
        }

        System.out.println("Opdater kundens information for: " + customer.getName());
        System.out.print("Ny adresse: ");
        String newAddress = scanner.nextLine();
        customer.setAddress(newAddress);
        customerDAO.updateCustomer(customer);
        System.out.println("Kundens adresse er blevet opdateret.");
    }
}
