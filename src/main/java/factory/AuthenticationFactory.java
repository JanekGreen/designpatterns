package factory;

import factory.authentication.Authentication;
import factory.authentication.EmailAuthentication;
import factory.authentication.SMSAuthentication;

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
