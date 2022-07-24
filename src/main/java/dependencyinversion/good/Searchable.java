package dependencyinversion.good;

import dependencyinversion.bad.Customer;
import java.util.List;
import java.util.Optional;

public interface Searchable {
    Optional<Customer> findById(int id);
    List<Customer> findAll();
}
