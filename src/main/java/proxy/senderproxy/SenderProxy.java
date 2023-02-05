package proxy.senderproxy;

import proxy.Sender;
import proxy.SenderImpl;

//Proxy implementuje oryginalny interfejs
public class SenderProxy implements Sender {
    private final Sender sender;
    public SenderProxy() {
        this.sender = new SenderImpl();
    }

    @Override
    public String send(String message) {
        System.out.println("Before sending....");
        StringBuilder sb = new StringBuilder(message).reverse();
        String send = sender.send(sb.toString());
        System.out.println("after sending");
        return send;
    }
}
