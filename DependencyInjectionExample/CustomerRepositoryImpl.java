package DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // In a real application, this would query a database or another data source.
        // For this example, we'll return a mock customer.
        return "Customer with ID: " + id;
    }
}

