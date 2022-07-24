package dependencyinversion.good.impl;

import dependencyinversion.bad.Customer;
import dependencyinversion.good.Searchable;
import java.util.List;
import java.util.Optional;

public class FileSource implements Searchable {

    @Override
    public Optional<Customer> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

}
