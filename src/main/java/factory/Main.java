package factory;

import factory.authentication.Authentication;

public class Main {

    public static void main(String[] args) {
        AuthenticationFactory factory = new AuthenticationFactory();
        Authentication authentication = factory.getAuthentication(AuthenticationType.EMAIL);
        authentication.authenticate();
        authentication = factory.getAuthentication(AuthenticationType.SMS);
        authentication.authenticate();
    }
}
