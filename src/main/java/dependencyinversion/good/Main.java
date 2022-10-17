package dependencyinversion.good;

import dependencyinversion.good.impl.CustomerDaoImpl;
import dependencyinversion.good.impl.FileSource;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService(new CustomerDaoImpl());
        customerService.findAll()
                        .forEach(System.out::println);
        customerService.findById(2);
        CustomerService fileSourceCustService = new CustomerService(new FileSource());
        fileSourceCustService.findById(1);
        fileSourceCustService.findAll();

    }
}
