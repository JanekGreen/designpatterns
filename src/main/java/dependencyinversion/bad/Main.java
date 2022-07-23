package dependencyinversion.bad;

public class Main {

    public static void main(String[] args) {

        /*w razie zmiany trzeba napisać nową klase będącą zamiennikiem CustomerDaoImpl ale także zmienić customer service!*/
        CustomerService customerService = new CustomerService(new CustomerDaoImpl());

    }
}
