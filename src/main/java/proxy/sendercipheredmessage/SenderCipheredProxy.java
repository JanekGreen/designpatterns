package proxy.sendercipheredmessage;

import proxy.Sender;
import proxy.SenderImpl;

import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SenderCipheredProxy implements Sender {
    private final Sender sender;

    public SenderCipheredProxy() {
        sender = new SenderImpl();
    }

    @Override
    public String send(String message) {
       /* StringBuilder sb = new StringBuilder(message);
        String reversed = sb.reverse().toString();*/

        String reversedWhat= message.chars()
                .mapToObj(i -> (char) i)
                .map(String::valueOf)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());

        String reversed = message.chars()
                .mapToObj(i -> (char) i)
                .map(String::valueOf)
                .reduce("",(a,b) ->b+a);

        return sender.send(reversedWhat);
    }
}
