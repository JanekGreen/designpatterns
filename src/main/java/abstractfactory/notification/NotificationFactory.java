package abstractfactory.notification;

import abstractfactory.AbstractFactory;

public class NotificationFactory implements AbstractFactory<Notification> {

    @Override
    public Notification create(String type) {
        if(type.equalsIgnoreCase("SMS")){
            return new SMSNotification();
        } else if(type.equalsIgnoreCase("EMAIL")){
           return new EmailNotification();
        }
        return null;
    }

}
