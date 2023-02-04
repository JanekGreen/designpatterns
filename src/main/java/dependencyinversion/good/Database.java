package dependencyinversion.good;


import java.util.*;

public class Database implements Searchable {
    private static final Map<Integer, Customer> customers;
    static {
        customers = new HashMap<>();
        customers.put(1, new Customer("Janek"));
        customers.put(2, new Customer("Dorota"));
        customers.put(3, new Customer("Tomasz"));
    }


    @Override
    public List<dependencyinversion.good.Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public Optional<dependencyinversion.good.Customer> findById(int id) {
        return Optional.of(customers.get(id));
    }
}
