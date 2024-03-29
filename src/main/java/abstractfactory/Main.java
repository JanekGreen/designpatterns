package abstractfactory;

import abstractfactory.authentication.Authentication;
import abstractfactory.notification.Notification;
import abstractfactory.packages.Package;

public class Main {

    public static void main(String[] args) {
        AbstractFactory<Notification> factory = FactoryProvider.getFactory("Notification");
        //AbstractFactory factory = FactoryProvider.getFactory("Notification");
        Notification sms = factory.create("SMS");
        sms.notifyUser();
        Notification email = factory.create("EMAIL");
        email.notifyUser();
        factory = FactoryProvider.getFactory("Authentication");
        Authentication authSms = (Authentication) factory.create("SMS");
        authSms.authenticate();
        Authentication authEmail = (Authentication) factory.create("EMAIL");
        authEmail.authenticate();

        /*Dodajemy nowy rodzaj fabryki, który pozwoli produkować nam paczki (morskie i powietrzne)
         * */

    }
}
