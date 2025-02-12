package DependencyInjectionExample;


public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create an instance of the concrete repository
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service via constructor
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find and display a customer
        customerService.displayCustomer(1);
    }
}
