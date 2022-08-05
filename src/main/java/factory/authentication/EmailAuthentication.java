package factory.authentication;

public class EmailAuthentication implements Authentication {

    @Override
    public boolean authenticate() {
        System.out.println("Authenticated via Email");
        return true;
    }

}
