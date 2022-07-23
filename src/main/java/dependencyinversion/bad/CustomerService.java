package dependencyinversion.bad;

import java.util.List;
import java.util.Optional;

public class CustomerService {
    CustomerDaoImpl customerDaoImpl;

    public CustomerService(CustomerDaoImpl customerDaoImpl) {
        this.customerDaoImpl = customerDaoImpl;
    }
    public Optional<Customer> findById(int id){
       return customerDaoImpl.findById(id);
    }
    public List<Customer> findAll(){
      return   customerDaoImpl.findAll();
    }

}
