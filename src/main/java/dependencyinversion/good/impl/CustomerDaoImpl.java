package dependencyinversion.good.impl;

import dependencyinversion.bad.Customer;
import dependencyinversion.good.Searchable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CustomerDaoImpl implements Searchable {

    private static final Map<Integer, Customer> customers;
    static {
        customers = new HashMap<>();
        customers.put(1, new Customer("Janek"));
        customers.put(2, new Customer("Dorota"));
        customers.put(3, new Customer("Tomasz"));
    }

    @Override
    public Optional<Customer> findById(int id){
        return Optional.ofNullable(customers.get(id));
    }

    @Override
    public List<Customer> findAll(){
        return new ArrayList<>(customers.values());

    }

}
