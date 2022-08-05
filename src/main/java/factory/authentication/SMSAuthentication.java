package factory.authentication;

public class SMSAuthentication implements Authentication {

    @Override
    public boolean authenticate() {
        System.out.println("Authenticated via SMS");
        return true;
    }

}
