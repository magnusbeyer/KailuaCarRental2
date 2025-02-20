import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
    private List<Customer> customers = new ArrayList<>();

    public CustomerDAO() {
        // Initial sample data (this can be replaced with a real database connection)
        customers.add(new Customer(1, "John Doe", "1234 Elm St", "12345", "Kailua", "123456789", "987654321", "john.doe@example.com", "D1234567", "2010-05-01"));
        customers.add(new Customer(2, "Jane Smith", "5678 Oak St", "54321", "Honolulu", "987654321", "123456789", "jane.smith@example.com", "S7654321", "2015-02-15"));
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Customer getCustomerByID(int customerID) {
        for (Customer customer : customers) {
            if (customer.getCustomerID() == customerID) {
                return customer;
            }
        }
        return null;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void updateCustomer(Customer customer) {
        Customer existingCustomer = getCustomerByID(customer.getCustomerID());
        if (existingCustomer != null) {
            existingCustomer.setAddress(customer.getAddress());
        }
    }
}
