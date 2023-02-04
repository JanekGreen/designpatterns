package factory.authentication;

public class TokenAuthentication implements Authentication{
    @Override
    public boolean authenticate() {
        System.out.println("Authentication via token");
        return true;
    }
}
