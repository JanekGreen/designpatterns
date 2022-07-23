package abstractfactory.notification;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Notified by e-mail");
    }

}
