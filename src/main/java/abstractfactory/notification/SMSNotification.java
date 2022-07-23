package abstractfactory.notification;

public class SMSNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Notified by SMS");

    }

}
