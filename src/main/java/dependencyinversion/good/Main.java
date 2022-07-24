package dependencyinversion.good;

import dependencyinversion.good.impl.CustomerDaoImpl;
import dependencyinversion.good.impl.FileSource;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService(new CustomerDaoImpl());
        customerService.findAll();
        customerService.findById(2);
        CustomerService fileSourceCustService = new CustomerService(new FileSource());
        fileSourceCustService.findById(1);
        fileSourceCustService.findAll();

        Optional<String> name = getNameOpt();
        String modifiedString =
                name.map(s -> "string " + s)
                .filter(str -> str.length()> 20)
                .orElse("else");



        String example = getName();
        if(example != null && example.length() > 20){
            example = "string "+ example;
        }else{
            example = "else";
        }

        System.out.println(modifiedString);

    }
    public static Optional<String> getNameOpt(){
        return Optional.ofNullable("Jaaa");
    }
    public static String getName(){
        return "Jaaa";
    }
}
