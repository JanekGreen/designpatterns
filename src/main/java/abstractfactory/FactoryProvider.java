package abstractfactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String type) {
        if (type.equalsIgnoreCase("Notification")) {
            return new NotificationFactory();

        } else if (type.equalsIgnoreCase("Authentication")) {
            return new AuthenticationFactory();
        }
        return null;
    }

}
