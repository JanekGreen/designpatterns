package proxy.senderproxy;

import proxy.Sender;
import proxy.SenderImpl;

public class SenderProxy implements Sender {
    private final Sender sender;
    public SenderProxy() {
        this.sender = new SenderImpl();
    }

    @Override
    public String send(String message) {
        System.out.println("Before sending....");
        /*oryginalny kod*/
        String send = sender.send(message);
        System.out.println("after sending");
        return send;
    }
}
