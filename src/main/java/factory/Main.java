package factory;

import factory.authentication.*;
import factory.payment.Payment;
import factory.payment.PaymentFactory;
import factory.payment.PaymentType;

public class Main {

    public static void main(String[] args) {
        AuthenticationFactory factory = new AuthenticationFactory();
        Authentication authentication = factory.getAuthentication(AuthenticationType.EMAIL);
        authentication.authenticate();
        authentication = factory.getAuthentication(AuthenticationType.SMS);
        authentication.authenticate();
        authentication = factory.getAuthentication(AuthenticationType.TOKEN);
        authentication.authenticate();
        //Robimy PaymentFactory, która będzie produkowała obiekty implementujące interface Pay w zależności od typu PaymentType.
        PaymentFactory paymentFactory = new PaymentFactory();
        Payment payment =  paymentFactory.getPaymentMethod(PaymentType.BLIK);
        payment.pay();
        payment =  paymentFactory.getPaymentMethod(PaymentType.CARD);
        payment.pay();
    }
}
