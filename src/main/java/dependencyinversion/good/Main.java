package dependencyinversion.good;

import dependencyinversion.good.impl.FileSource;
import dependencyinversion.good.impl.NetworkSource;

public class Main {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerService(new Database());
        customerService.findById(1);
        CustomerService fileCustomerService = new CustomerService(new FileSource());
        fileCustomerService.findById(1);
        CustomerService customerService1 = new CustomerService(new NetworkSource());


    }
}
