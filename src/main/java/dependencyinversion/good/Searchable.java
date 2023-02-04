package dependencyinversion.good;


import java.util.List;
import java.util.Optional;

public interface Searchable {
     List<Customer> findAll();
    public Optional<Customer> findById(int id);


}
