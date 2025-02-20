import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
    private List<Customer> customers = new ArrayList<>();

    public CustomerDAO() {
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
