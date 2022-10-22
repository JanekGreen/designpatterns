package proxy;

import proxy.senderproxy.SenderProxy;

public class Main {
    public static void main(String[] args) {
        Sender sender = new SenderImpl();
        sender.send("message");
        Sender senderProxy = new SenderProxy();
        senderProxy.send("message with proxy");
    }
}
