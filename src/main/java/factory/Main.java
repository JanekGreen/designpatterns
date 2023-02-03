package factory;

import factory.authentication.*;

public class Main {

    public static void main(String[] args) {
        AuthenticationFactory factory = new AuthenticationFactory();
        Authentication authentication = factory.getAuthentication(AuthenticationType.EMAIL);
        authentication.authenticate();
        authentication = factory.getAuthentication(AuthenticationType.SMS);
        authentication.authenticate();
        //Robimy PaymentFactory, która będzie produkowała obiekty implementujące interface Pay w zależności od typu PaymentType.

    }
}
