package dependencyinversion.bad;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FileSource {
    public Optional<Customer> findById(int id){
        return Optional.empty();
    }
    public List<Customer> findAll(){
        return new ArrayList<>();
    }


}
