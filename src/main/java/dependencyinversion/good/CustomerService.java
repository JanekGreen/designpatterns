package dependencyinversion.good;

import dependencyinversion.bad.Customer;
import java.util.List;
import java.util.Optional;

public class CustomerService {
    Searchable searchable;

    public CustomerService(Searchable searchable) {
        this.searchable = searchable;
    }
    public Optional<dependencyinversion.bad.Customer> findById(int id){
       return searchable.findById(id);
    }
    public List<Customer> findAll(){
      return   searchable.findAll();
    }

}
