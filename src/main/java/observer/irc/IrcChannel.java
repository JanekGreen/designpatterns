package observer.irc;

import java.util.ArrayList;
import java.util.List;

public class IrcChannel implements ObservableChannel{
    List<String> users = new ArrayList<>();

    private List<ChatObserver> chatObservers = new ArrayList<>();
    @Override
    public void register(ChatObserver observer) {
        chatObservers.add(observer);
    }

    @Override
    public void unregister(ChatObserver observer) {
        chatObservers.remove(observer);

    }
    public void logIn(String user){
        users.add(user);
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        /*ostatni z listy, on się zalogował*/
        String latestUser = users.get(users.size() - 1);
        for (ChatObserver observer : chatObservers){
            observer.notifyUserLoggedIn(latestUser);
        }
    }
}
