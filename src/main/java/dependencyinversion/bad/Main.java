package dependencyinversion.bad;

public class Main {

    public static void main(String[] args) {

        //Chcielibyśmy w customerService obsłużyć coś więcej niż tylko bazę danych, na przyklad umożliwić szukanie po plikach....
        //CustomerService customerServiceFile = new CustomerService(new FileSource());
        CustomerService customerService = new CustomerService(new Database());

    }
}
