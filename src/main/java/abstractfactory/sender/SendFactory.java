package abstractfactory.sender;

import abstractfactory.AbstractFactory;

public class SendFactory implements AbstractFactory<Send> {

    @Override
    public Send create(String type) {
        if ("pidgeon".equalsIgnoreCase(type)) {
            return new PidgeonSend();
        } else if ("ship".equalsIgnoreCase(type)) {
            return new ShipSend();
        }
        throw new IllegalArgumentException("Unknown type");
    }

}
