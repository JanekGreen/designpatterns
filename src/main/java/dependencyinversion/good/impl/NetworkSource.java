package dependencyinversion.good.impl;

import dependencyinversion.good.Customer;
import dependencyinversion.good.Searchable;

import java.util.List;
import java.util.Optional;

public class NetworkSource implements Searchable {
    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Optional<Customer> findById(int id) {
        return Optional.empty();
    }
}
