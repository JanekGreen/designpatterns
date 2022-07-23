package abstractfactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = FactoryProvider.getFactory("Notification");
        Notification sms = (Notification) factory.create("SMS");
        sms.notifyUser();
        Notification email = (Notification) factory.create("EMAIL");
        email.notifyUser();
        factory = FactoryProvider.getFactory("Authentication");
        Authentication authSms = (Authentication) factory.create("SMS");
        authSms.authenticate();
        Authentication authEmail = (Authentication) factory.create("EMAIL");
        authEmail.authenticate();


    }
}
