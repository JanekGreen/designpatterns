package proxy;

import proxy.sendercipheredmessage.SenderCipheredProxy;
import proxy.senderproxy.SenderProxy;

public class Main {
    public static void main(String[] args) {
        Sender sender = new SenderProxy();
        sender.send("message");


    }
}
