package factory;

import factory.authentication.Authentication;
import factory.authentication.EmailAuthentication;
import factory.authentication.SMSAuthentication;

public class AuthenticationFactory {
    public Authentication getAuthentication(AuthenticationType type){
        if(type == AuthenticationType.SMS){
            return new SMSAuthentication();
        }
        if(type == AuthenticationType.EMAIL){
            return new EmailAuthentication();
        }

       return null;
    }
}
