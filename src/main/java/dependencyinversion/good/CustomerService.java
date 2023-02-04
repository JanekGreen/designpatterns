package dependencyinversion.good;

import java.util.List;
import java.util.Optional;

/*musimy umożliwić CustomerService używanie Database (bazy danych, i plików)*/
/*Musimy go uniezależnić od bazy danych*/
public class CustomerService {

    Searchable searchable;

    //przekazaliśmy abstrakcje (interfejs)
    public CustomerService(Searchable searchable) {
        this.searchable = searchable;

    }
    public Optional<Customer> findById(int id){
        return searchable.findById(id);
    }
    public List<Customer> findAll(){
        return   searchable.findAll();
    }
}
