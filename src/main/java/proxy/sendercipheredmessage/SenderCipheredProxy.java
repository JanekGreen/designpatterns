package proxy.sendercipheredmessage;

import proxy.Sender;
import proxy.SenderImpl;

public class SenderCipheredProxy implements Sender {
   private final Sender sender;

    public SenderCipheredProxy() {
        sender = new SenderImpl();
    }

    @Override
    public String send(String message) {
        StringBuilder sb = new StringBuilder(message);
        String reversed = sb.reverse().toString();
        return sender.send(reversed);
    }
}
