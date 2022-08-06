package factory;

import factory.authentication.Authentication;
import factory.authentication.EmailAuthentication;
import factory.authentication.SMSAuthentication;

public class Main {

    public static void main(String[] args) {
        AuthenticationFactory factory = new AuthenticationFactory();
        Authentication authentication = factory.getAuthentication(AuthenticationType.EMAIL);
        authentication.authenticate();
        authentication = factory.getAuthentication(AuthenticationType.SMS);
        authentication.authenticate();

        /*dozwolone dla klasy która implementuje interface Authentication*/
        Authentication authentication1 = new EmailAuthentication();
        Authentication authentication2 = new SMSAuthentication();
    }
}
