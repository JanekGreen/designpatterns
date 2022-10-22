package proxy;

public class SenderImpl implements Sender {
    @Override
    public String send(String message) {
        System.out.println("sending message...");
        return message;
    }
}
