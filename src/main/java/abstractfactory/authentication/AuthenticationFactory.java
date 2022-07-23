package abstractfactory.authentication;

import abstractfactory.AbstractFactory;

public class AuthenticationFactory implements AbstractFactory<Authentication> {

    @Override
    public Authentication create(String type) {
        if(type.equalsIgnoreCase("SMS")){
            return new SMSAuthentication();
        }else if (type.equalsIgnoreCase("EMAIL")){
            return new EmailAuthentication();
        }
        return null;

    }

}
