package factory.authentication;

public class AuthenticationFactory {
    public Authentication getAuthentication(AuthenticationType type){
        if(type == AuthenticationType.SMS){
            return new SMSAuthentication();
        }
        if(type == AuthenticationType.EMAIL){
            return new EmailAuthentication();
        }
        if(type == AuthenticationType.TOKEN){
            return new TokenAuthentication();
        }

       return null;
    }
}
