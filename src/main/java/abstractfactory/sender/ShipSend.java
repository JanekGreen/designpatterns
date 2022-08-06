package abstractfactory.sender;

public class ShipSend implements Send{

    @Override
    public void send() {
        System.out.println("Sent by ship");
    }

}
