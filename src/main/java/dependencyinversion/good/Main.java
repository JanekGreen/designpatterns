package dependencyinversion.good;

import dependencyinversion.good.impl.CustomerOracleDbImpl;
import dependencyinversion.good.impl.FileSource;

public class Main {

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService(new CustomerOracleDbImpl());
        customerService.findAll()
                        .forEach(System.out::println);
        customerService.findById(2);
        CustomerService fileSourceCustService = new CustomerService(new FileSource());
        fileSourceCustService.findById(1);
        fileSourceCustService.findAll();


    }
}
