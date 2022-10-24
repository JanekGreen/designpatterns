package abstractfactory;

import abstractfactory.authentication.AuthenticationFactory;
import abstractfactory.notification.NotificationFactory;
import abstractfactory.packages.PackageFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String type) {
        if (type.equalsIgnoreCase("Notification")) {
            return new NotificationFactory();

        } else if (type.equalsIgnoreCase("Authentication")) {
            return new AuthenticationFactory();
        } else if(type.equalsIgnoreCase("package"))
        return new PackageFactory();
    return null;
    }

}
