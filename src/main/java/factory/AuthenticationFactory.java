package factory;

public class AuthenticationFactory {
    public Authentication getAuthentication(AuthenticationType type){
        if(type == AuthenticationType.SMS){
            return new EmailAuthentication();
        }
        if(type == AuthenticationType.EMAIL){
            return new SMSAuthentication();
        }

       return null;
    }
}
